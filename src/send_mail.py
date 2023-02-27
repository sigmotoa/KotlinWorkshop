import gitlab
import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
from email.mime.application import MIMEApplication

def enviar_correo(destinatario, nombre_usuario, resultado, archivo_adjunto):
    # Conectar a GitLab
    gl = gitlab.Gitlab('https://gitlab.com', private_token='tu_token')

    # Obtener la dirección de correo electrónico del servicio de asistencia técnica de GitLab
    servicio_asistencia = gl.users.list(username='gitlab-service-desk')[0]
    remitente = servicio_asistencia.email

    # Configurar los parámetros del correo electrónico
    asunto = "Nombre de usuario y resultado del pipeline de GitLab"
    cuerpo = f"Hola,\nEl nombre de usuario del último commit en GitLab es: {nombre_usuario}.\n\nEl resultado del pipeline fue: {resultado}.\n\nSaludos cordiales,"

    # Crear el objeto de mensaje
    mensaje = MIMEMultipart()
    mensaje['From'] = remitente
    mensaje['To'] = destinatario
    mensaje['Subject'] = asunto

    # Agregar el cuerpo del mensaje
    mensaje.attach(MIMEText(cuerpo, 'plain'))

    # Agregar el archivo adjunto
    with open(archivo_adjunto, 'rb') as f:
        adjunto = MIMEApplication(f.read(), _subtype='xml')
        adjunto.add_header('Content-Disposition', 'attachment', filename=archivo_adjunto)
        mensaje.attach(adjunto)

    # Configurar el servidor SMTP
    servidor_smtp = smtplib.SMTP('smtp.gmail.com', 587)
    servidor_smtp.starttls()
    servidor_smtp.login(remitente, 'tu_contraseña')

    # Enviar el correo electrónico utilizando la API de correo electrónico de GitLab
    servidor_smtp.sendmail(remitente, destinatario, mensaje.as_string())
    servidor_smtp.quit()

