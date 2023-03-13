echo "gitlab-runner  ALL=(ALL) NOPASSWD: ALL" >> /etc/sudoers
sudo apt-get update && sudo apt-get install -y msmtp-mta
sudo apt-get install sharutils
#cp ./src/ssmtp.conf /etc/ssmtp/

cp ./src/.msmtprc ~/.msmtprc
cp ./src/.msmtprc $HOME/.msmtprc
cp ./src/.msmtprc /root/.msmtprc



chmod 600 ~/.msmtprc
chmod 600 $HOME/.msmtprc
chmod 600 /root/.msmtprc

#sudo ufw allow SMTP
#cp ./src/msmtp.conf /etc/msmtp/
#echo "root:test_gitlab_sigmotoa@yahoo.com:smtp.mail.yahoo.com:587" > /etc/ssmtp/revaliases
#cat /etc/ssmtp/revaliases

#ls -lha /etc/msmtp/
destiny=$GITLAB_USER_EMAIL
subject="Result test"
msg="Attached the results"
attached=test-results.xml
#echo $destiny
#echo $GITLAB_USER_EMAIL
mail=$(echo -e "Subject: $subject\n\n $msg")
if [[ -f "$attached" ]]; then
mail=$(echo -e "Subject: $subject\nContent-Type: text/plain; charset=utf-8\nContent-Disposition: attachment; filename=$(basename $attached)\n\n $msg" ; uuencode --base64 $attached $(basename $attached))
fi
echo "$mail" | msmtp $destiny