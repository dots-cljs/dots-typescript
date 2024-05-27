(ns dots.typescript.server.protocol.code-fix-action)

(defn fix-name
  "Short name to identify the fix, for use by telemetry.
   
   **Returns:** `string`"
  ^js [code-fix-action]
  (.-fixName ^js code-fix-action))

(defn set-fix-name!
  "Short name to identify the fix, for use by telemetry."
  ^js [code-fix-action value]
  (set! (.-fixName ^js code-fix-action) value))

(defn fix-id
  "If present, one may call 'getCombinedCodeFix' with this fixId.
   This may be omitted to indicate that the code fix can't be applied in a group.
   
   **Returns:** `{} | undefined`"
  ^js [code-fix-action]
  (.-fixId ^js code-fix-action))

(defn set-fix-id!
  "If present, one may call 'getCombinedCodeFix' with this fixId.
   This may be omitted to indicate that the code fix can't be applied in a group."
  ^js [code-fix-action value]
  (set! (.-fixId ^js code-fix-action) value))

(defn fix-all-description
  "Should be present if and only if 'fixId' is.
   
   **Returns:** `string | undefined`"
  ^js [code-fix-action]
  (.-fixAllDescription ^js code-fix-action))

(defn set-fix-all-description!
  "Should be present if and only if 'fixId' is."
  ^js [code-fix-action value]
  (set! (.-fixAllDescription ^js code-fix-action) value))

(defn description
  "Description of the code action to display in the UI of the editor
   
   **Returns:** `string`"
  ^js [code-fix-action]
  (.-description ^js code-fix-action))

(defn set-description!
  "Description of the code action to display in the UI of the editor"
  ^js [code-fix-action value]
  (set! (.-description ^js code-fix-action) value))

(defn changes
  "Text changes to apply to each file as part of the code action
   
   **Returns:** `FileCodeEdits[]`"
  ^js [code-fix-action]
  (.-changes ^js code-fix-action))

(defn set-changes!
  "Text changes to apply to each file as part of the code action"
  ^js [code-fix-action value]
  (set! (.-changes ^js code-fix-action) value))

(defn commands
  "A command is an opaque object that should be passed to `ApplyCodeActionCommandRequestArgs` without modification.
   
   **Returns:** `{}[] | undefined`"
  ^js [code-fix-action]
  (.-commands ^js code-fix-action))

(defn set-commands!
  "A command is an opaque object that should be passed to `ApplyCodeActionCommandRequestArgs` without modification."
  ^js [code-fix-action value]
  (set! (.-commands ^js code-fix-action) value))
