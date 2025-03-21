# Download text #
- Visit [https://www.gutenberg.org/ebooks/1342](https://www.gutenberg.org/ebooks/1342) and open the plain text version of Pride and Prejudice. Once that opens copy the link at the top of your screen and combine it with the wget command in your terminal to download this text straight from the terminal. ![[wget1.png]]
- 1.) to enter the downloaded text, use nano + the file name ^^  shown  in quotes above![[wget2.png]]
2.) Save and exit - Using control X, you can save and exit out of the text
3.) Copy, Cut and paste - To copy and paste, use control + shift + C, and control + shift + V.       To cut, simply use control + K
4.) Go to the beginning of a file - First use control + / to open directional commands, then           use control + Y to go to the first line
5.) Go to the end of a file - First use control + / to open directional commands, then use               control + V to go to the last line
6.) Search for target string - To search for a target string use control + W to execute the             where is command
7.) Search and replace - To search and replace you can use the replace command by doing control + \ to execute the replace command

# Hardcore Mode Tutorial 
- For this tutorial we are going to use the same downloaded text just with different commands.
- in terminal type in the 'vim' command + your txt file name to open the file
- In order to save and exit your file, simply type :wq and press enter
- When you are in your text, press 'y' when highlighting text to copy it. To paste, use 'ctrl' + 'shift' + P to paste before your cursor. Finally, to cut, highlight text and press 'd'.
- If you would like to return to the beginning of your text, press 'gg' to go to the beginning of the file. To go to the end of a file, use control shift G to jump to the end.
- If you wish to find a particular target string, type in '/' and then the text you are looking for and hit enter.
- In order to find and replace text in a file, use this command :%s/x/y/g where x is what you would like to find, and y is what you are going to replace it with