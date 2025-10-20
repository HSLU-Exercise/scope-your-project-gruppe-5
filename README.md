[![Java Matrix Build](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/java-matrix-build.yml/badge.svg)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/java-matrix-build.yml) [![Python Matrix Build](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/python-matrix-build.yml/badge.svg)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/python-matrix-build.yml) [![Simple Java Ci](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/simple-java-ci.yml/badge.svg)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/simple-java-ci.yml) [![Simple Java Ci](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/simple-python-ci.yml/badge.svg)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/simple-python-ci.yml) [![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT) [![GitHub release](https://img.shields.io/github/release/HSLU-Eercise/scope-your-project-gruppe-5)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/releases) ![Contributors](https://img.shields.io/github/contributors/HSLU-Exercise/scope-your-project-gruppe-5) ![Commits](https://img.shields.io/github/commit-activity/m/HSLU-Exercise/scope-your-project-gruppe-5) ![Downloads](https://img.shields.io/github/downloads/HSLU-Exercise/scope-your-project-gruppe-5/total?color=blue)
![Stars](https://img.shields.io/github/stars/HSLU-Exercise/scope-your-project-gruppe-5?style=social)

# CI with GitHub Actions

This repository demonstrates continuous integration (CI) workflows using GitHub Actions for a simple calculator implemented in Java and Python. It includes both simple and matrix-based CI pipelines to ensure code quality through linting and testing.

---

## 👥 Team Contact

We are the project team from **Hochschule Luzern (HSLU)**.  
If you have any questions about our project, feel free to contact us directly.

### 📧 Contact us
[![Email](https://img.shields.io/badge/📧-Team%20Email-blue?style=flat&logo=gmail&logoColor=white)](mailto:shayan.guhathasan@stud-hslu.ch,david.redzic@stud.hslu.ch,abdelrahman.mahfouz@stud.hslu.ch,satyen.tripathi@stud.hslu.ch,paul.berchtold@stud.hslu.ch,simon.linggi@stud.hslu.ch?subject=HSLU%20Project%20Inquiry&body=Hello%20Team%2C%0A%0AI%20have%20a%20question%20regarding%20your%20HSLU%20project.%0A%0AThank%20you!)

---

### 👨‍💻 Team Members

| Name |
|------|
| **Shayan Guhathasan** | 
| **David Redzic**  | 
| **Abdelrahman Mahfouz** |
| **Satyen Tripathi** | 
| **Paul Berchtold** |
| **Simon Linggi** |

---

### 🏫 Hochschule Luzern (HSLU)
[![HSLU Website](https://img.shields.io/badge/HSLU-Visit%20Website-blue?style=flat&logo=googlechrome&logoColor=white)](https://www.hslu.ch/de-ch/)

---


## Repository Structure

- `java/`: Java implementation of the calculator.
  - `src/main/java/SimpleCalculator.java`: Core calculator logic.
  - `src/test/java/SimpleCalculatorTest.java`: JUnit tests.
  - `checkstyle.xml`: Checkstyle configuration for linting.
  - `pom.xml`: Maven configuration.
- `python/`: Python implementation of the calculator.
  - `simple_calculator.py`: Core calculator logic.
  - `test_simple_calculator.py`: Pytest tests.
  - `.flake8`: Flake8 configuration for linting.
- `.github/workflows/`:
  - `simple-java-ci.yml`: Simple Java CI (Java 25, Ubuntu).
  - `java-matrix-build.yml`: Matrix Java CI (Java 21/25, Ubuntu/Windows).
  - `simple-python-ci.yml`: Simple Python CI (Python 3.13, Ubuntu).
  - `python-matrix-build.yml`: Matrix Python CI (Python 3.12/3.13, Ubuntu/Windows).
- `.gitignore`: Excludes build artifacts (e.g., `java/target/`, `flake8-report.txt`) to keep the repository clean.
- `README.md`: This file.

## CI Workflows

### Java CI
- **Simple Java CI** (`simple-java-ci.yml`):
  - Runs Checkstyle for linting and JUnit for testing on Java 25, Ubuntu.
  - No artifact management; outputs are logged in the Actions tab.
- **Java Matrix Build** (`java-matrix-build.yml`):
  - Runs linting and testing across Java 21/25 and Ubuntu/Windows.
  - Stores Checkstyle and JUnit reports as artifacts for 30 days.

### Python CI
- **Simple Python CI** (`simple-python-ci.yml`):
  - Runs Flake8 for linting and pytest for testing on Python 3.13, Ubuntu.
  - No artifact management; outputs are logged in the Actions tab.
- **Python Matrix Build** (`python-matrix-build.yml`):
  - Runs linting (Flake8) and testing (pytest) across Python 3.12/3.13 and Ubuntu/Windows.
  - Stores Flake8 and pytest reports as artifacts for 30 days.

## Artifact Management

- The `.gitignore` file ensures build artifacts (e.g., `java/target/`, `flake8-report.txt`, `pytest-report.xml`) are not committed to the repository.
- Matrix workflows (`java-matrix-build.yml`, `python-matrix-build.yml`) store reports as artifacts in GitHub Actions for 30 days, accessible in the Actions tab.
- Simple workflows (`simple-java-ci.yml`, `simple-python-ci.yml`) do not store artifacts, keeping the setup minimal.


## GitHub Docs

https://docs.github.com/en/actions/get-started/continuous-integration


![CI with Actions](assets/ci_with_actions.png)

![Group Project Deliverable](assets/group_project_deliverable.png)


[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/YOGwUpA-)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=20510281&assignment_repo_type=AssignmentRepo)
