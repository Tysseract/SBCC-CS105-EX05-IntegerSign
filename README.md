## Exercise: IntegerSign (8 Points)

The project name of this exercise is **IntegerSign**.

The purpose of this assignment is to apply what you have learned about decisions with `if` statements and multiple alternatives.

### Problem Description

The detailed description of this problem comes from the Programming Exercise P3.1 that is in the book (page 126, of the _Late Objects_ version).

This problem should be solved by writing code in `public static void main` to get input from the user. And then write code in 'public static determineSign' to output a string with either `negative`, `positive` or `zero`, based on the number given to the method.

Using the test input, your output should look like:

`Enter a number: -1 
negative`

### Getting Started

Like our last exercise, WE are going to do this exercise by writing the source code that solves the problem first in **IntegerSign.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md) create a source file called **IntegerSign.java**. This is where your code will go. Replace the code in that file with the code in the grey box below:

```java
package edu.sbcc.cs105;

public class IntegerSign {

    public static String determineSign(int integer) {
        // Put code here to determine sign of value and return string representation
    }
    
    public static void main(String[] args) {
        // Put code here to get input from user, then call determineSign
    }

}
```

Now go through IntegerSign.java, **add the proper headers**, as in past assignments, and then change the [CHANGE THIS TO YOUR INFORMATION] text to the proper items. There are two items to be changed. **Don't forget** to add comments to the beginning of your methods, as well.

For your code, get a number from the user using the `Scanner` class as in past assignments, then output the words `negative`, `positive` or `zero` only. The unit test will test for exactly these words.

Once you've written your code run the code by single clicking on **IntegerSign.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

Once you have run the tests, the results of them should look something like the following:

<img src="https://www.dropbox.com/s/79zw4fbsjebbx1s/junit_test.png?dl=1" width="257" height="445" />

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to BitBucket. Once you've completed this step your code will be on BitBucket in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...**. You should see the following dialog:

![Commit dialogue](https://www.dropbox.com/s/lojod76ghyzl626/commit-git.png?dl=1)

Now follow these steps to commit and push your code:

1. Select the files by check marking the files you want to commit. In this case **IntegerSign.java**. 
2. Enter a commit message. The commit message can be anything, but should describe the changes that are begin committed. A good commit message in this case might be "Committing code to check in for assignment"
3. Press **Commit and Push**

You will see a few more dialogs (including ones that may ask for your BitBucket username and password) go by and then you will see something similar to the following:

![Push dialogue](https://www.dropbox.com/s/niao32p4abbx4k2/push-git.png?dl=1)

1. Push **OK** to complete the commit. You may get no confirmation, but you can check BitBucket to see if the code now exists there.

#### Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **pull request** in the class BitBucket repository. This action will indicate to the original project that you have finished your coding and it will create a place to give feedback on a line by line basis. 

Go to **your** repository or the repository for this assignment on BitBucket (the project you forked from to create your project).

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/create-pull-request.png" width="207" height="207" />

1\. Click on the **Create pull request** icon. 

You should see something similar to this picture:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-screen-first.png" width="600" height="250" />

The next screen then shows the source and destination of the pull request. Your code is the source and is listed at the top. The destination is the original project that you forked from. The only thing to do on this screen is to select the **master** branch for your project. Once you select **Select Branch**, as directed below, you should see the following:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-master.png" width="600" height="250" />

2\. Select **Select Branch** you should see something like this:

3\. Select **master** 

4\. Press the **Continue** button.

Once you've followed these steps you should see this at the top:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-description.png" width="514" height="325" />

5\. Under **Title**, give the pull request a meaningful title. It's mostly for your benefit.

6\. Under **Description**, describe the purpose of this pull request. Usually it's just to submit the assignment. However, you can also use this field to let me know anything that might be wrong or different with your code.

7\. Finally, click on **Create**

After selecting **Create**, your code should build and be tested within a minute or so. Remember, green good, red bad.