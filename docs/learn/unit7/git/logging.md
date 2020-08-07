---
layout: default
title: Logging
permalink: learn/unit7/logging
parent: Unit 7
grand_parent: Learn
nav_order: 6
---

<!-- prettier-ignore-start -->

# Unit 7: Git - Logging
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

<!-- prettier-ignore-end -->

## Logging

An important part of Git is keeping track of history and being able to access
different points in time. Logging commands help with just that!

## git log

`git log` displays commit history, which includes the author of the commit, the
full commit message, timestamp, and commit hash (the seemingly random sequence
of letters and numbers that is a unique identifier for each commit).

If the log is long, you may need to use the down arrow key to move down the log.
Press Esc to end browsing the log.

For example:

```bash
$ git log
commit ed19c251cd5182577a9ff8918db792853cca1f43 (HEAD -> units, origin/units)
Author: Jane Doe <janedoe@example.com>
Date:   Tue Aug 4 23:17:29 2020 -0700

    Add Command Line page

commit ca9d3c8e93db8f6880507ce1c5d3b1ee9d1448d0
Author: Jane Doe <janedoe@example.com>
Date:   Tue Aug 4 21:27:18 2020 -0700

    Add Exception Handling page, add/edit lesson code

commit 2f49c4ddc5ab6c11137733c2cdf314105689b935
Author: Jane Doe <janedoe@example.com>
Date:   Mon Aug 3 23:13:39 2020 -0700

    Update changelog for v0.7.0
```

### --oneline

Use the `--oneline` flag to display a condensed log where each commit only takes
up one line. This also shows the shorter version of the commit hash, which is
really all you need.

```bash
$ git log --oneline
ed19c25 (HEAD -> units, origin/units) Add Command Line page
ca9d3c8 Add Exception Handling page, add/edit lesson code
2f49c4d Update changelog for v0.7.0
```

### --graph

Use the `--graph` flag to display the log as a visual timeline.

```bash
$ git log --graph
* commit ed19c251cd5182577a9ff8918db792853cca1f43 (HEAD -> units, origin/units)
| Author: Jane Doe <janedoe@example.com>
| Date:   Tue Aug 4 23:17:29 2020 -0700
|
|     Add Command Line page
|
* commit ca9d3c8e93db8f6880507ce1c5d3b1ee9d1448d0
| Author: Jane Doe <janedoe@example.com>
| Date:   Tue Aug 4 21:27:18 2020 -0700
|
|     Add Exception Handling page, add/edit lesson code
|
* commit 2f49c4ddc5ab6c11137733c2cdf314105689b935
| Author: Jane Doe <janedoe@example.com>
| Date:   Mon Aug 3 23:13:39 2020 -0700
|
|     Update changelog for v0.7.0
```

## git shortlog

`git shortlog` displays a shorter version of `git log`. Each commit is grouped
by author and commit header.

```bash
$ git shortlog
AfraMahammad (2):
      Add basic unit 2 material
      Merge branch 'units' of https://github.com/omega9656/learn-code into units

Amaan Mahammad (1):
      Add unit 5 material

Dusty the Dog (4):
      Create GitHub pages for this repository
      Set theme jekyll-theme-cayman
      Delete index.html
      Delete _config.yml

Rebecca (28):
      Finish unit 1 lessons and practice
      Finish unit 1 lessons and practice
      Add day 1 of unit 3 (methods)
      Add topics to each program
```
