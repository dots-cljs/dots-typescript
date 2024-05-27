(ns dots.typescript.code-action)

(defn description
  "Description of the code action to display in the UI of the editor
   
   **Returns:** `string`"
  ^js [code-action]
  (.-description ^js code-action))

(defn set-description!
  "Description of the code action to display in the UI of the editor"
  ^js [code-action value]
  (set! (.-description ^js code-action) value))

(defn changes
  "Text changes to apply to each file as part of the code action
   
   **Returns:** `FileTextChanges[]`"
  ^js [code-action]
  (.-changes ^js code-action))

(defn set-changes!
  "Text changes to apply to each file as part of the code action"
  ^js [code-action value]
  (set! (.-changes ^js code-action) value))

(defn commands
  "If the user accepts the code fix, the editor should send the action back in a `applyAction` request.
   This allows the language service to have side effects (e.g. installing dependencies) upon a code fix.
   
   **Returns:** `InstallPackageAction[] | undefined`"
  ^js [code-action]
  (.-commands ^js code-action))

(defn set-commands!
  "If the user accepts the code fix, the editor should send the action back in a `applyAction` request.
   This allows the language service to have side effects (e.g. installing dependencies) upon a code fix."
  ^js [code-action value]
  (set! (.-commands ^js code-action) value))
