(ns dots.typescript.server.protocol.code-action)

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
   
   **Returns:** `FileCodeEdits[]`"
  ^js [code-action]
  (.-changes ^js code-action))

(defn set-changes!
  "Text changes to apply to each file as part of the code action"
  ^js [code-action value]
  (set! (.-changes ^js code-action) value))

(defn commands
  "A command is an opaque object that should be passed to `ApplyCodeActionCommandRequestArgs` without modification.
   
   **Returns:** `{}[] | undefined`"
  ^js [code-action]
  (.-commands ^js code-action))

(defn set-commands!
  "A command is an opaque object that should be passed to `ApplyCodeActionCommandRequestArgs` without modification."
  ^js [code-action value]
  (set! (.-commands ^js code-action) value))
