# Continuous Integration (CI) with GitHub Actions

## Introduction
This repository, `scope-your-project-gruppe-5`, is a project by students from Hochschule Luzern (HSLU) to demonstrate Continuous Integration (CI) using GitHub Actions. It provides automated linting and testing for Java and Python code, serving as a learning resource and reusable template set for developers and students. The CI setup includes simple and matrix workflows to ensure code quality across multiple environments.

## Badges

### CI Status
[![Java Matrix Build](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/java-matrix.yml/badge.svg)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/java-matrix.yml) [![Simple Java CI](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/java-simple.yml/badge.svg)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/java-simple.yml) [![Python Matrix Build](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/python-matrix.yml/badge.svg)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/python-matrix.yml) [![Simple Python CI](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/python-simple.yml/badge.svg)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/python-simple.yml)

### Repository Stats
[![License](https://img.shields.io/badge/License-MIT-blue)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/blob/main/LICENSE) [![Release](https://img.shields.io/github/v/release/HSLU-Exercise/scope-your-project-gruppe-5?style=flat&color=blue)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/releases) [![Contributors](https://img.shields.io/github/contributors/HSLU-Exercise/scope-your-project-gruppe-5?style=flat&color=blue)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/graphs/contributors) [![Commits](https://img.shields.io/github/commit-activity/y/HSLU-Exercise/scope-your-project-gruppe-5?style=flat&color=blue)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/graphs/commit-activity) [![Last commit](https://img.shields.io/github/last-commit/HSLU-Exercise/scope-your-project-gruppe-5?style=flat&color=blue)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/commits) [![Downloads](https://img.shields.io/github/downloads/HSLU-Exercise/scope-your-project-gruppe-5/total?style=flat&color=blue)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/releases) [![Stars](https://img.shields.io/github/stars/HSLU-Exercise/scope-your-project-gruppe-5?style=flat&color=blue)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/stargazers)

## About
We are a team from Hochschule Luzern (HSLU), developing this project for our course IT Project Basics (IPROBA).

Contact us: [![Team Email](https://img.shields.io/badge/E--Mail-Project_Members-orange?style=flat&logo=mailboxdotorg&logoColor=white)](mailto:shayan.guhathasan@stud-hslu.ch;david.redzic@stud.hslu.ch;abdelrahman.mahfouz@stud.hslu.ch;satyen.tripathi@stud.hslu.ch;simon.linggi@stud.hslu.ch?subject=Workflow%20and%20Badges%20Inquiry&body=Hello%20Team%2C%0A%0A)

Learn more: [![HSLU Website](https://img.shields.io/badge/Visit_Website-HSLU-orange?style=flat&logo=internetarchive)](https://www.hslu.ch/de-ch/informatik/)

## Repository Structure
```
scope-your-project-gruppe-5/
├── .github/workflows/   # CI workflow (YAML) files
├── java/                # Java code and configs
├── python/              # Python code and configs
├── templates/           # Reusable CI templates
├── .gitignore           # Excludes build artifacts
├── LICENSE              # MIT license
└── README.md            # This file
```

## CI Workflows

### Lint & Test
- **`java-simple.yml`**: Runs Checkstyle to check Java code style and JUnit tests to verify functionality on Java 25 in a single Ubuntu environment.
- **`java-matrix.yml`**: Tests Java code across Java 21/25 and Ubuntu/Windows, using Maven to run Checkstyle and JUnit tests, uploading lint/test reports as artifacts.
- **`python-simple.yml`**: Runs Flake8 to check Python code style and pytest to verify functionality on Python 3.13 in a single Ubuntu environment.
- **`python-matrix.yml`**: Tests Python code across Python 3.12/3.13 and Ubuntu/Windows, running Flake8 and pytest, uploading lint/test reports as artifacts.

### Build status notifications
- **`demo-email-notify.yml`**: Sends Gmail SMTP notifications: manual demo email via workflow_dispatch and automatic failure alerts for selected workflows; uses SMTP_* secrets and MY_EMAIL/CLASS_EMAILS variables; includes repo, branch, commit, and run URL.
- **`demo-discord-notify.yml`**: Posts Discord webhook alerts: manual test/fail/success embeds via workflow_dispatch and automatic failure embeds for monitored workflows; uses DISCORD_WEBHOOK secret; embeds include repo, branch, commit, and run URL.

## Reusing Templates
To use our CI setup in your project:
1. Copy workflow templates from `templates/` (e.g., `java-simple-template.yml`, `python-matrix-template.yml`) to your `.github/workflows/` directory. See GitHub Docs for setup details.
2. Copy linting templates (`checkstyle-template.xml` to your Java folder, e.g., `java/` as `checkstyle.xml`; `pom-template.xml` to your Java folder, e.g., `java/` as `pom.xml`; `.flake8-template` to your Python folder, e.g., `python/`).
3. Follow comments in each template to adjust settings like branch names, Java/Python versions, file paths, or linting rules (e.g., line length in `.flake8-template` or Checkstyle rules in `checkstyle-template.xml`).
4. See the templates for specific instructions and refer to Checkstyle Configuration or Flake8 Configuration for linting details.

## Resources
- [GitHub Docs](https://docs.github.com/en/actions/using-workflows)
- [Maven Documentation](https://maven.apache.org/guides/)
- [JUnit Documentation](https://docs.junit.org/)
- [Checkstyle Configuration](https://checkstyle.sourceforge.io/config.html)
- [Pytest Documentation](https://docs.pytest.org/)
- [Flake8 Configuration](https://flake8.pycqa.org/en/latest/user/configuration.html)
- [Flake8 Rules](https://www.flake8rules.com/)
- [Shields.io (Badges)](https://shields.io/)
- [Simple Icons (Bades)](https://simpleicons.org)

## GitHub Classroom
[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/YOGwUpA-)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=20510281&assignment_repo_type=AssignmentRepo)
