# The-Easy-Animator
A simple 2D animation player (built in Java).

**Project Description.** The Easy Animator is a pair programming project (collaborated with peer R.L.). The project is intented for learning and practising CS concepts/topics, which includes (but not limited to) object-oriented design, MVC architecture, testing, GUI etc. 

**Feature.** Animations can be played in 4 modes: 
1) *visual* - a straightforward visual play
2) *playback* - an interactve version of the visual play (additional features include manually start, restart, pause/resume, enable/disable looping, and increase/decrease animation play speed)
3) *svg* - display animations in svg text and 
4) *text* - display animations in plain text.

**Animation Play Instruction**. The animator is designed to run in the terminal with a JAR file and command-line arguement. The program reads one of the existing formated and provided input text files in the specified play mode (can be found under "out/artifacts/The_Easy_Animator_jar"). If the chosen play mode is visual, users need to specify the play speed (e.g., 50; the bigger the number, the greater the speed). Here are some valid examples of the command-line argument to run the animator: 
- java -jar JARFILENAME -in toh-3.txt -view text 
- java -jar JARFILENAME -in toh-3.txt -view svg 
- java -jar JARFILENAME -in toh-5.txt -view visual -speed 20 
- java -jar JARFILENAME -in toh-5.txt -view playback
