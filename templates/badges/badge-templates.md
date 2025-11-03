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

```markdown
<!-- Ersetze OWNER und REPO durch deinen GitHub-Namen -->
<!-- Ersetze die Workflow-Dateien (z. B. java-matrix.yml) mit deinen eigenen CI-Dateien -->

[![Java Matrix Build](https://github.com/OWNER/REPO/actions/workflows/java-matrix.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/java-matrix.yml)
[![Simple Java CI](https://github.com/OWNER/REPO/actions/workflows/java-simple.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/java-simple.yml)
[![Python Matrix Build](https://github.com/OWNER/REPO/actions/workflows/python-matrix.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/python-matrix.yml)
[![Simple Python CI](https://github.com/OWNER/REPO/actions/workflows/python-simple.yml/badge.svg)](https://github.com/OWNER/REPO/actions/workflows/python-simple.yml)```

### 💡 Beispiel unserer Gruppe:

