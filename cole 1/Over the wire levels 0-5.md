# Level 0 #
Open a linux terminal and enter this command:
	ssh bandit0@bandit.labs.overthewire.org -p 2220
	When prompted for the password, enter bandit0, as shown below
	![[bandit0.png]]
	Congrats! You are now in.
	Type ls into the terminal to view the files/directories. it will show a file called readme, so type in 'cat readme' to the terminal to get the password for level 1.
# Level 1 #
Type exit into the terminal to exit bandit0. repeat the ssh command instead as such 'ssh bandit1@bandit.labs.overthewire.org -p 2220' nd enter the password from level 0 you found in read me to log in. Now that you are in repeat the same sequence, 'ls' to find a file named '-' However you cannot search this file directly so when using 'cat' command, enter 'cat ./-' to get the password for level 2, pictured below
Another option to secure this password is to use the nano command in place of cat which will also get the same result.
![[bandit1.png]]
# Level 2 #
Once again type exit into the console to logout of bandit1. Then repeat the same ssh command with bandit2 instead - 'ssh bandit2@bandit.labs.overthewire.org -p 2220'. Now that you are in, enter the password you received on level 1 get in. Once you are in repeat 'ls' command again which will find you 'spaces in this filename'. Now we can't just search spaces in this filename as it will search it as four separate files so put it in quotations so in scans as one, and enter the command cat "spaces in this filename" and that will get you the next level.
Another option to secure this password is to use the nano command in place of cat which will also get the same result.
![[bandit2.png]]
# Level 3 #
Type exit, to logout again and repeat the same ssh command as above instead with bandit3. type 'ls' once again which will find us the 'inhere' directory which we can enter using the cd command. Within this directory there is hidden files so we must use the ls -a command to show hidden files, which reveals ...Hiding-From-You. Finally, we can use cat ...Hiding-From-You which reveals our password.
Another option to secure this password is to use the nano command in place of cat which will also get the same result.
![[bandit3.png]]

# Level 4 #
Again type exit and ssh into bandit 4 using bandit4@bandit.labs.overthewire.org -p 2220. Once you are in enter the password from the last level to get in. Again type ls which again gets us the inhere directory, which we can enter using the cd inhere command. Once you are in the directory type ls to get a list of numbered files. the first option is slightly inconvenient but it would be to cat/nano every file in the directory which will result in the password coming out of file01. 
Another option however is to use filters shown in level 5 a little later
![[bandit4.png]]

# Level 5 #
Exit out of level 4 and ssh into bandit5 with the previously mentioned commands. Use 'ls' command again which will locate another inhere directory which once again we can enter using cd and using the ls command to find a list of numbered directories called maybehere.
Now one solution is to scan through every file in every directory, however that would take forever so we can use some filter commands to make it easier. Using ls -la we can find 88 hidden commands which can narrow it down a little bit. On the bandit website they give us the details that the file is human-reabable, 1033 bytes in size, and non executable. To filter all of these details into one command we can use this command : 
file */{.,}* | grep "ASCII text" | grep -v ' , with very long lines'
This will narrow it down to 7 files and using one final command we can narrow it down to 1033 bytes in size:
 du -b -a | grep 1033
 This will result in one file which we can open using cat.
 Congrats! you have completed levels 1-5
