destiny = $GITLAB_USER_EMAIL
subject = "Result test"
msg = "Attached the results"
attached=test-results.xml
mail=$(echo -e "Subject: $subject\n\n $msg")
if [[ -f "$attached"" ]]; then
mail=$(echo -e "Subject: $subject\nContent-Type: text/plain; charset=utf-8\nContent-Disposition: attachment; filename=$(basename $attached)\n\n $msg" ; uuencode --base64 $attached $(basename $attached))
fi
echo "$mail" | ssmtp $destiny