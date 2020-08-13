$title="Authentication Required - Mozilla Firefox"  ;variable declaration
WinWaitActive($title)     ;It will wait for authentication box to show up
Send("username")		; passing username as string
Send("{TAB}")			;pressing TAB key
Send("password")		;passing password as string
Send("{ENTER}")			;pressing ENTER key



#comments-start

this is how we comment inside auto it scripts

#comments-end