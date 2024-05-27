(ns dots.typescript.rename-info-success)

(defn can-rename
  "**Returns:** `true`"
  ^js [rename-info-success]
  (.-canRename ^js rename-info-success))

(defn set-can-rename!
  ^js [rename-info-success value]
  (set! (.-canRename ^js rename-info-success) value))

(defn file-to-rename
  "File or directory to rename.
   If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
   
   **Returns:** `string | undefined`"
  ^js [rename-info-success]
  (.-fileToRename ^js rename-info-success))

(defn set-file-to-rename!
  "File or directory to rename.
   If set, `getEditsForFileRename` should be called instead of `findRenameLocations`."
  ^js [rename-info-success value]
  (set! (.-fileToRename ^js rename-info-success) value))

(defn display-name
  "**Returns:** `string`"
  ^js [rename-info-success]
  (.-displayName ^js rename-info-success))

(defn set-display-name!
  ^js [rename-info-success value]
  (set! (.-displayName ^js rename-info-success) value))

(defn full-display-name
  "Full display name of item to be renamed.
   If item to be renamed is a file, then this is the original text of the module specifer
   
   **Returns:** `string`"
  ^js [rename-info-success]
  (.-fullDisplayName ^js rename-info-success))

(defn set-full-display-name!
  "Full display name of item to be renamed.
   If item to be renamed is a file, then this is the original text of the module specifer"
  ^js [rename-info-success value]
  (set! (.-fullDisplayName ^js rename-info-success) value))

(defn kind
  "**Returns:** `ScriptElementKind`"
  ^js [rename-info-success]
  (.-kind ^js rename-info-success))

(defn set-kind!
  ^js [rename-info-success value]
  (set! (.-kind ^js rename-info-success) value))

(defn kind-modifiers
  "**Returns:** `string`"
  ^js [rename-info-success]
  (.-kindModifiers ^js rename-info-success))

(defn set-kind-modifiers!
  ^js [rename-info-success value]
  (set! (.-kindModifiers ^js rename-info-success) value))

(defn trigger-span
  "**Returns:** `TextSpan`"
  ^js [rename-info-success]
  (.-triggerSpan ^js rename-info-success))

(defn set-trigger-span!
  ^js [rename-info-success value]
  (set! (.-triggerSpan ^js rename-info-success) value))
