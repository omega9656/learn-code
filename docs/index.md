---
layout: default
title: Home
permalink: /home
nav_order: 1
---

# Learn Code
## A place where you can learn or teach basic FTC programming, presented by FTC 9656 Omega. 

---

This website is currently in progress. Please excuse the mess!

## Getting Started
This website is intended to be used as a resource for students and teachers who want to learn basic FTC programming. What do we mean by "basic FTC programming"? Read the [About](/about) page to find out.

To get started, you'll just need 2 things: This website and the example/practice code from the [Learn Code GitHub repository](https://github.com/omega9656/learn-code).

### Download Code
You can either download the code by downloading a ZIP file
and extracting it, or cloning it on the terminal via [Git](https://git-scm.com/) (assuming you have installed it). 

*If you would like to learn more about Git, please see our section on it [here](/learn/unit8/git.md).*

1. [Download ZIP](https://github.com/omega9656/learn-code/zipball/master/){: .btn }

2. Using Git
```shell
$ git clone https://github.com/omega9656/learn-code.git
```


## Contributing
Contributions are welcome in the form of Issues or Pull Requests on GitHub. Before contributing, read our [Contributing Guidelines](https://github.com/omega9656/learn-code/blob/master/CONTRIBUTING.md) and [Code of Conduct](https://github.com/omega9656/learn-code/blob/master/CODE_OF_CONDUCT.md). Also be sure to follow the [Pull Request Template](https://github.com/omega9656/learn-code/blob/master/pull_request_template.md)

### Contributors
Thank you to the contributors of Learn Code!

<ul class="list-style-none">
{% for contributor in site.github.contributors %}
    <li class="d-inline-block mr-1">
        <a href="{{ contributor.html_url }}"><img src="{{ contributor.avatar_url }}" width="32" height="32" alt="{{ contributor.login }}"/></a>
    <li>
{% endfor %}
<ul>

<!--
    Code for Contributors section from
    https://github.com/pmarsceill/just-the-docs/blob/master/index.md
-->