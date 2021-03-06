# The Easy Animator
*A simple 2D animation player (built in Java)*

**Project Description.** The project is intended for learning and practicing CS concepts/topics, which includes (but not limited to) object-oriented design, MVC architecture, testing, GUI etc. 

**Feature.** Animations can be played in 4 modes: 
1) *visual* - a straightforward visual play
2) *playback* - an interactive version of the visual play (additional features include manually start, restart, pause/resume, enable/disable looping, and increase/decrease animation play speed)
3) *svg* - display animations in svg text and 
4) *text* - display animations in plain text

**Animation Play Instruction**. The animator is designed to run in the terminal with a JAR file and command-line arguement. The program reads one of the existing formated and provided input text files in the specified play mode (can be found under "out/artifacts/The_Easy_Animator_jar"; e.g., "-in toh-3.txt -view visual"). If the chosen play mode is visual, users need to specify the play speed (e.g., "-speed 50"; the bigger the number, the greater the speed). In svg/text mode, if the user would like to save the svg/text output to a file, this can be done by typing "-out" and specifying an output file name in the command-line. Here are some valid examples of the command-line argument to run the animator: 

- java -jar The_Easy_Animator.jar -in toh-3.txt -view text 
- java -jar The_Easy_Animator.jar -in toh-3.txt -out -outfilename -view svg 
- java -jar The_Easy_Animator.jar -in toh-5.txt -view visual -speed 20 
- java -jar The_Easy_Animator.jar -in toh-5.txt -view playback

**Sample Images**.

![](Sample_Images/Tower%20of%20Hanoi.png)
![](Sample_Images/Big%20Bang.png)
![](Sample_Images/SVG.png)
