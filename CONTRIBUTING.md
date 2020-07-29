# Contributing Guidelines

Hey there! Are you an educator or student in the FIRST robotics community who
wants to contribute example or practice problem code to this repository? Did you
find an error in our existing code?

If so, please make sure you read the entirety of these guidelines before
submitting a pull request. You may also want to read our
[Code of Conduct](https://github.com/FTC-9656-Omega-Robotics/HowToCode/blob/master/CODE_OF_CONDUCT.md).

## Follow good programming style.

### Install Checkstyle

You can learn more about Checkstyle [here](https://checkstyle.sourceforge.io/).

This will save you time because when you submit a pull request (PR) on GitHub,
we check for good programming style using this linter.

**Your PR will not be approved unless it passes those style checks.**

Also, linters basically enforce all of the style rules that we discuss below, so
you basically can just skip to the
[next section](#follow-omega-how-to-code-format).

### Whitespace

-   Indent properly.
-   Make sure there are spaces between binary operators, parentheses, curly
    braces, etc. when applicable. (For method calls, there should not be a space
    between the method name and the parentheses.)
-   Leave empty lines where appropriate to increase readability

### Naming

-   Name files so that they are representative of what the program is about. Use
    class naming conventions (e.g. first letter of each word is capitalized, no
    spaces or underscores between words).
-   Name variables/methods descriptively but concisely. Use camelCase for
    regular variables, and snake case + all uppercase letters for constants.

### Reduce complexity

-   If a line of code is very long, separate it into 2+ lines (e.g. for long
    lists/arrays, long print statements, etc.)
-   Add comments to explain parts of your code
-   Break up the program into methods if applicable and if methods have been
    introduced already at that point in time

## Follow Omega How to Code format

-   Make sure you put the file(s) in the right directories.
    -   All code filed under `practice` should be practice problems.
        -   They must include a multi-line comment at the top of the file (but
            after the package statement and any imports) with full instructions
            for the problem.
    -   All code filed under `challenges` should be practice problems that are
        harder than the basic code knowledge you need for robotics. They should
        follow the same guidelines as practice problems (see above).
    -   All code filed under `lessons` should be example code that demonstrates
        a concept or two.
        -   They must include a multi-line comment at the top of the file (but
            after the package statement and any imports) with a bulleted list of
            topics that are covered (use - as bullets)
    -   Refer to the
        [Organization page](https://github.com/FTC-9656-Omega-Robotics/HowToCode/wiki/Organization)
        on our Wiki to see how units are organized.
-   Make sure you have the correct package statement as the first line of your
    code.

## Testing

-   Thoroughly test your program. Make sure it works as intended.
-   Try to break your program! Don’t just give input you know will work.

## Check the content.

-   Make sure the problem is doable for the skill level of students at that
    point in time.
-   Practice problems shouldn’t take several hours/days.

## Cite your sources.

-   If you are using data or practice problems from somewhere other than
    yourself, you MUST cite your sources.
-   Providing a link to the original is usually sufficient if you found the
    problem online.
-   If you found it in a book, cite the full title and author.
-   Citations should be included in the multi-line comment that is at the top of
    the file (see
    [Follow Omega How to Code Format](#follow-omega-how-to-code-format))

## Submitting practice problem(s)

**\*Note 1:** We assume you know basic Git, e.g. committing, pushing, pulling,
branching, merging, etc. If you want to learn the basic Git you need to
contribute, we recommend watching
[this entire playlist.](https://www.youtube.com/watch?v=3RjQznt-8kE&list=PL4cUxeGkcC9goXbgTDQ0n_4TBzOO0ocPR&index=1)\*

**\*Note 2:** If you want an overview of the Pull Request (PR) workflow we are
using, read
[these articles](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/proposing-changes-to-your-work-with-pull-requests).\*

1. Clone or fork the repository.

-   [How to Clone](https://help.github.com/en/github/creating-cloning-and-archiving-repositories/cloning-a-repository)
-   [How to Fork](https://help.github.com/en/github/getting-started-with-github/fork-a-repo)

3. Work on the practice problems locally.

-   If you cloned the repo, make sure you create and checkout a new branch. **DO
    NOT MAKE EDITS ON THE MASTER BRANCH.**
-   If you forked the repo, you’re free to work on the master branch or make
    your own branches (though that is kinda unnecessary).
-   [Git Branches Tutorial](https://www.atlassian.com/git/tutorials/using-branches)

4. Push your local branch to remote.

-   [How to Push](https://help.github.com/en/github/using-git/pushing-commits-to-a-remote-repository)

5. Make a pull request to merge your branch with the master branch.

-   Make sure the title of your pull request is descriptive but concise.
-   Follow the PR template.
-   [How to Create a Pull Request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request)

6. Monitor the status of your Pull Request on GitHub.

-   It’s possible that the Omega will Request Changes, in which case you will
    need to commit those changes before your PR will be approved and merged into
    the official master branch.

**Thank you for following these guidelines and contributing to this
repository!**

_Questions? Message any 9656 member on the FTC Discord, or email us at
[ftc9656omega@gmail.com](mailto:ftc9656omega@gmail.com)._
