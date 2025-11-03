# 🏷️ Badges

In diesem Abschnitt lernst du, wie man Badges im GitHub-README verwendet.  
Badges sind kleine Statusanzeigen, die automatisch Informationen wie Builds, Versionen oder Downloads anzeigen.  
Sie helfen, auf einen Blick den Zustand und die Aktivität eines Projekts zu erkennen.

> 💡 **Tipp:**  
> Du kannst alle folgenden Beispiele direkt kopieren und in dein eigenes README einfügen.  
> Ersetze einfach **OWNER** durch deinen GitHub-Benutzernamen oder Organisation,  
> und **REPO** durch den Namen deines Projekts.

---

## 🎯 CI Status Badges

Diese Badges zeigen, ob dein Workflow erfolgreich durchläuft (`passing`) oder fehlschlägt (`failing`).  
GitHub aktualisiert sie automatisch nach jedem Workflow-Run.

<!-- Ersetze OWNER und REPO durch deinen GitHub-Namen -->
<!-- Ersetze die Workflow-Dateien (z. B. java-matrix.yml) mit deinen eigenen CI-Dateien -->
```markdown

[![Java Matrix Build](https://github.com/OWNER/REPO/actions/workflows/java-matrix.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/java-matrix.yml)
[![Simple Java CI](https://github.com/OWNER/REPO/actions/workflows/java-simple.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/java-simple.yml)
[![Python Matrix Build](https://github.com/OWNER/REPO/actions/workflows/python-matrix.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/python-matrix.yml)
[![Simple Python CI](https://github.com/OWNER/REPO/actions/workflows/python-simple.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/python-simple.yml)
```

### 💡 Beispiel unserer Gruppe:

```
[![Java Matrix Build](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/java-matrix.yml/badge.svg)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/actions/workflows/java-matrix.yml)
```
---

## 📊 Repository Stats Badges

Diese Badges zeigen wichtige Informationen über dein Repository an –
zum Beispiel Lizenz, Releases, Commits, Downloads oder Sterne ⭐️.

<!-- Ersetze OWNER und REPO -->
<!-- Du kannst Farbe und Stil mit ?style=...&color=... anpassen -->

### License 
Damit du es klickbar machen kannst, muss du eine LICENSE Datei in deinem Repository im main hinzufügen.  
```
[![License](https://img.shields.io/badge/License-MIT-blue)](https://github.com/OWNER/REPO/blob/main/LICENSE)
```


```

[![License](https://img.shields.io/badge/License-MIT-blue)](https://github.com/OWNER/REPO/blob/main/LICENSE)
[![Release](https://img.shields.io/github/v/release/OWNER/REPO?style=flat&color=blue)](https://github.com/OWNER/REPO/releases)
[![Contributors](https://img.shields.io/github/contributors/OWNER/REPO?style=flat&color=blue)](https://github.com/OWNER/REPO/graphs/contributors)
[![Commits](https://img.shields.io/github/commit-activity/y/OWNER/REPO?style=flat&color=blue)](https://github.com/OWNER/REPO/graphs/commit-activity)
[![Last commit](https://img.shields.io/github/last-commit/OWNER/REPO?style=flat&color=blue)](https://github.com/OWNER/REPO/graphs/commit-activity)
[![Downloads](https://img.shields.io/github/downloads/OWNER/REPO/total?style=flat&color=blue)](https://github.com/OWNER/REPO/releases)
[![Stars](https://img.shields.io/github/stars/OWNER/REPO?style=flat&color=blue)](https://github.com/OWNER/REPO/stargazers)

```
### 💡 Beispiel unserer Gruppe:

```
[![Release](https://img.shields.io/github/v/release/HSLU-Exercise/scope-your-project-gruppe-5?style=flat&color=blue)](https://github.com/HSLU-Exercise/scope-your-project-gruppe-5/releases)
```
---

## 🧑‍💻 About / Contact Badges

<!-- Passe die E-Mail-Adressen an dein Team an -->
<!-- Verwende Semikolons (;) zwischen mehreren E-Mails -->
```
Contact us:  
[![Team Email](https://img.shields.io/badge/E--Mail-Project_Members-orange?style=flat&logo=mailboxdotorg&logoColor=white)](mailto:vorname.nachname@stud.hslu.ch;andere.person@stud.hslu.ch?subject=Badge%20Template%20Frage&body=Hallo%20Team%2C%0A%0A)

Learn more:  
[![HSLU Website](https://img.shields.io/badge/Visit_Website-HSLU-orange?style=flat&logo=internetarchive)](https://www.hslu.ch/de-ch/informatik/)
```
### 💡 Beispiel unserer Gruppe:

```
[![Team Email](https://img.shields.io/badge/E--Mail-Project_Members-orange?style=flat&logo=mailboxdotorg&logoColor=white)](mailto:shayan.guhathasan@stud.hslu.ch;david.redzic@stud.hslu.ch;abdelrahman.mahfouz@stud.hslu.ch;satyen.tripathi@stud.hslu.ch;simon.linggi@stud.hslu.ch?subject=Workflow%20and%20Badges%20Inquiry&body=Hello%20Team%2C%0A%0A)
```
## 🎨 Stil & Anpassungen

Badges lassen sich mit Parametern anpassen.  
Diese Parameter kommen hinter ein `?` und werden mit `&` verbunden.

| Parameter | Beispielwert | Beschreibung |
|------------|---------------|---------------|
| **style** | `flat`, `flat-square`, `plastic`, `for-the-badge`, `social` | Form und Stil des Badges |
| **color** | `blue`, `green`, `red`, `#FF5733` | Hintergrundfarbe |
| **logo** | `github`, `python`, `java`, `mailboxdotorg` | Fügt ein Icon hinzu |
| **logoColor** | `white` oder `black` | Ändert die Farbe des Logos |
| **label** | `Downloads`, `Release`, `CI` | Text auf der linken Seite |
| **labelColor** | `gray`, `black` | Hintergrundfarbe des Labels |


