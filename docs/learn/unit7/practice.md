---
layout: default
title: Unit 7 Practice
permalink: learn/unit7/practice
parent: Unit 7
grand_parent: Learn
nav_order: 12
---

<!-- prettier-ignore-start -->

# Unit 7: Practice
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## A note on all problems

Problems tagged with the red **Unit 7 Repository** label utilize the
[Learn Code Unit 7](https://github.com/omega9656/learn-code-unit-7) repository.
Before starting the practice exercises, you need to download or clone a fresh
version of this repository.

Also, rather than having "solution code", the solution text file will outline
the commands you should have done. (There may be slight variation in things like
commit hashes, but everything else should be exactly the same.)

If you want to restart the problem for any reason, simply delete the repo
directory and then download/clone it again.

## Practice

### Input Mismatch

<!-- prettier-ignore-start -->

exception handling
{: .label }
Scanner
{: .label }
while loop
{: .label }

<!-- prettier-ignore-end -->

Create a class called `Blah` which prompts the user to enter an integer
continuously. If an `InputMismatchException` occurs, print an error message and
keep asking them for an `int`. If an `int` has been successfully entered, stop
asking the user for input and print the `int`.

Note that you will need to import `java.util.InputMismatchException`.

```java
public class InputMismatch {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit7/practice/InputMismatch.java){: .btn }

### Command Line

<!-- prettier-ignore-start -->

command line
{: .label }
bash
{: .label }
Unit 7 repository
{: .label .label-red }

<!-- prettier-ignore-end -->

Note: We are assuming you have not modified the Learn Code Unit 7 repository
after downloading/cloning it.

Everything done in this exercise is via the terminal.

1. Change directories into the `learn-code-unit-7` repo you downloaded/cloned.
   From now on, we will refer to this as the root directory, or simply root.
2. Remove the Readme file.
3. Create a file called `hello.txt`.
4. Add the following line to `hello.txt` (without quotes): "world"
5. Print the contents of `hello.txt`.
6. Change directories into `src/com/omegarobotics`.
7. List all of the files in this directory.
8. Go back up one directory.
9. Print the directory you're in.
10. Create a new directory called `practice`.
11. Change into the `practice` directory.
12. Create a file called `name.txt`.
13. Add the following line to `name.txt` (without quotes): "Jane Doe"
14. Go back up one directory.
15. Print the directory you're in.
16. Remove the `com` directory.

<!-- prettier-ignore -->
[Solution](/learn-code/learn/unit7/practice/command-line-solution){: .btn }

### Git

<!-- prettier-ignore-start -->

git
{: .label }
command line
{: .label }
Unit 7 repository
{: .label .label-red }

<!-- prettier-ignore-end -->

Note: We are assuming you have not modified the Learn Code Unit 7 repository
after downloading/cloning it.

Everything done in this exercise is via the terminal.

1. Change directories into the `learn-code-unit-7` repo you downloaded/cloned.
   From now on, we will refer to this as the root directory, or simply root.
2. Create a new file called `quote.txt`.
3. Add the following to `quote.txt` (without quotes): "Smart people are stupid."
4. Display the status of the repository.
5. Add the `quote.txt` file to the staging area.
6. Commit the changes with the message "Add quote.txt".
7. Change directories into `src/com/omegarobotics`.
8. Append your favorite song to `songs.txt`.
9. Append your favorite book to `books.txt`.
10. Append your favorite TV show to `tvshows.txt`.
11. Display the status of the repository.
12. Add all of the modified files to the staging area.
13. Commit the changes with the message "Add my favorite song, book, and TV
    show".
14. Display the log of commits.
15. Create a new branch called `feature` and check it out.
16. Add another song you like to `songs.txt` and commit that change.
17. Check out the `master` branch.
18. Remove `songs.txt` and commit that change.
19. Merge `feature` into `master`. Resolve the conflict by completing the
    deletion of `songs.txt`.
20. Delete the `feature` branch.

<!-- prettier-ignore -->
[Solution](/learn-code/learn/unit7/practice/git-solution){: .btn }

### GitHub

<!-- prettier-ignore-start -->

git
{: .label }
github
{: .label }
command line
{: .label }
forking
{: .label }
pull requests
{: .label }

<!-- prettier-ignore-end -->

Go to the [Learn Code Unit 7](https://github.com/omega9656/learn-code-unit-7)
repository on GitHub.

1. Fork the repository to your account.
2. Clone your forked repository to local. (Use the terminal.)

Open an IDE or text editor application and do the following (from now on you can
choose to complete the instructions using the application's GUI or using the
command line):

<!-- prettier-ignore-start -->

1. Make a new directory called `practice` in the root directory and change into it.
2. Create a new file called `hello.txt` and add the following: "Hello world, I'm a programmer".
3. Add and commit the changes with the message `"Add hello.txt"`.
5. Push the changes to your remote `master` branch.
6. Checkout the `feature` branch.
7. Add the line "Java is an object-oriented programming language" to `hello.txt`.
8. Add and commit the changes with the message `"Add Java description"`.
9. Checkout the `master` branch.
10. Replace the line "Hello world, I'm a programmer" in `hello.txt` with 2 lines:
```
This is the way the world ends
Not with a bang, but a whimper
```
11. Add and commit the changes with the message `"Add poem lines"`.
12. Merge `feature` into `master`. Resolve the conflict so that `hello.txt` looks like this:
```
Hello world, I'm a programmer
This is the way the world ends
Not with a bang, but a whimper
```
13. Push the changes to your remote `master` branch.

Go to the official [Learn Code Unit 7](https://github.com/omega9656/learn-code-unit-7) repository.

1. Create a new pull request by comparing `omega9656:master` with `your_username:master` (where
`your_username` is replaced by your GitHub username).
2. Be sure to include a concise title and description of what changed.
3. Label your pull request with the green `practice` label.

[Solution](/learn-code/learn/unit7/practice/github-solution){: .btn }

<!-- prettier-ignore-end -->

## Challenges

### Retrieve Element

<!-- prettier-ignore-start -->

exception handling
{: .label }
arrays
{: .label }
Scanner
{: .label }

<!-- prettier-ignore-end -->

Adapted from Exercise 12.3 from _Introduction to Java Programming
(Comprehensive)_, 10th ed. by Y. Daniel Liang

Create a class called `RetrieveElement` which meets the following requirements:

-   Creates an array with 100 randomly chosen integers (use
    `Math.random() * 100` and cast the result to `int`)
-   Continuously prompts the user to enter the index of the array, then displays
    the corresponding element value. If the specified index is out of bounds,
    display the message `"Out of Bounds"`.
-   The program should end when the user enters `"quit"` (case insensitive\*)
-   If the user enters anything other than an index or `"quit"`, display the
    message `"Invalid index"`

\*To check if two strings are equal without taking into account case, use the
`equalsIgnoreCase` method.

Note that we have not told you what exception classes you need to catch. Use
your brain - how can you figure out which classes to use?

Hint: When using `Scanner`, you will need to use the `next` method to give the
user the flexibility to enter any type. The return type of this method is
`String`, so you will need to use the `Integer.parseInt` method to convert the
`String` into an `int`.

```java
public class RetrieveElement {
    public static void main(String[] args) {
        // write your code here
    }
}
```

<!-- prettier-ignore -->
[Solution]({{ site.github.repository_url }}/tree/master/src/com/omegarobotics/unit7/challenges/RetrieveElement.java){: .btn }
