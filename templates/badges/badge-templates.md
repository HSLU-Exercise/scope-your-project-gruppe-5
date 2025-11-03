# 🧩 Badge Templates

Dieser Ordner enthält Vorlagen für Badges, die im README angezeigt werden können.  
Kopiere den gewünschten Code in dein eigenes `README.md` und passe **Organisation (OWNER)** und **Repository-Name (REPO)** an.  

> 🔧 **Tipp:**  
> Die Parameter `?style=flat&color=blue` können beliebig angepasst werden (siehe „Stil & Anpassungen“ im Cheat-Sheet).

---

## 🎯 CI Status Badges

Diese Badges zeigen, ob der Code-Build erfolgreich ist (`passing` oder `failing`).  
Sie werden automatisch aktualisiert, sobald ein Workflow im GitHub-Repository ausgeführt wird.

```markdown
<!-- Ersetze OWNER und REPO durch deinen eigenen GitHub-Benutzernamen oder Organisationsnamen -->
<!-- Ersetze workflow-datei.yml durch den Namen deiner Workflow-Datei im Ordner .github/workflows/ -->

[![Java Matrix Build](https://github.com/OWNER/REPO/actions/workflows/java-matrix.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/java-matrix.yml)
[![Simple Java CI](https://github.com/OWNER/REPO/actions/workflows/java-simple.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/java-simple.yml)
[![Python Matrix Build](https://github.com/OWNER/REPO/actions/workflows/python-matrix.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/python-matrix.yml)
[![Simple Python CI](https://github.com/OWNER/REPO/actions/workflows/python-simple.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/python-simple.yml)

Beispiel unserer Gruppe

[![Java Matrix Build](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/java-matrix.yml/badge.svg)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/java-matrix.yml)

## 📊 Repository Stats Badges

Diese Badges zeigen Informationen über das Repository an – z. B. Lizenz, Releases, Aktivität, Downloads oder Sterne.

<!-- Ersetze OWNER und REPO in jeder URL -->
<!-- Passe ggf. Farbe oder Stil an (z. B. style=for-the-badge, color=orange) -->

[![License](https://img.shields.io/badge/License-MIT-blue)](https://github.com/OWNER/REPO/blob/main/LICENSE)
[![Release](https://img.shields.io/github/v/release/OWNER/REPO?style=flat&color=blue)](https://github.com/OWNER/REPO/releases)
[![Contributors](https://img.shields.io/github/contributors/OWNER/REPO?style=flat&color=blue)](https://github.com/OWNER/REPO/graphs/contributors)
[![Commits](https://img.shields.io/github/commit-activity/y/OWNER/REPO?style=flat&color=blue)](https://github.com/OWNER/REPO/graphs/commit-activity)
[![Last commit](https://img.shields.io/github/last-commit/OWNER/REPO?style=flat&color=blue)](https://github.com/OWNER/REPO/graphs/commit-activity)
[![Downloads](https://img.shields.io/github/downloads/OWNER/REPO/total?style=flat&color=blue)](https://github.com/OWNER/REPO/releases)
[![Stars](https://img.shields.io/github/stars/OWNER/REPO?style=flat&color=blue)](https://github.com/OWNER/REPO/stargazers)

Beispiel unserer Gruppe

[![Release](https://img.shields.io/github/v/release/HSLU-Exercise/scope-your-project-gruppe-5?style=flat&color=blue)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/releases)

## 🧑‍💻 About / Contact Section

Hier kannst du Team-Informationen, Kontakt-Badges oder externe Links einfügen.
Die Badges können Mails öffnen oder Websites verlinken.

<!-- Passe die E-Mail-Adressen an dein Team an -->
<!-- Nutze Semikolons (;) zwischen den Adressen und %20 für Leerzeichen im Text -->

Contact us:  
[![Team Email](https://img.shields.io/badge/E--Mail-Project_Members-orange?style=flat&logo=mailboxdotorg&logoColor=white)](mailto:vorname.nachname@stud.hslu.ch;andere.person@stud.hslu.ch?subject=Badge%20Template%20Frage&body=Hallo%20Team%2C%0A%0A)

Learn more:  
[![HSLU Website](https://img.shields.io/badge/Visit_Website-HSLU-orange?style=flat&logo=internetarchive)](https://www.hslu.ch/de-ch/informatik/)

Beispiel unserer Gruppe

[![Team Email](https://img.shields.io/badge/E--Mail-Project_Members-orange?style=flat&logo=mailboxdotorg&logoColor=white)](mailto:shayan.guhathasan@stud.hslu.ch;david.redzic@stud.hslu.ch;abdelrahman.mahfouz@stud.hslu.ch;satyen.tripathi@stud.hslu.ch;simon.linggi@stud.hslu.ch?subject=Workflow%20and%20Badges%20Inquiry&body=Hello%20Team%2C%0A%0A)
