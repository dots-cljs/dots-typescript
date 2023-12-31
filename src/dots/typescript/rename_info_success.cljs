(ns dots.typescript.rename-info-success)

(defn can-rename
  ^js [rename-info-success]
  (.-canRename ^js rename-info-success))

(defn set-can-rename!
  ^js [rename-info-success value]
  (set! (.-canRename ^js rename-info-success) value))

(defn file-to-rename
  "File or directory to rename.
   If set, `getEditsForFileRename` should be called instead of `findRenameLocations`."
  ^js [rename-info-success]
  (.-fileToRename ^js rename-info-success))

(defn set-file-to-rename!
  "File or directory to rename.
   If set, `getEditsForFileRename` should be called instead of `findRenameLocations`."
  ^js [rename-info-success value]
  (set! (.-fileToRename ^js rename-info-success) value))

(defn display-name
  ^js [rename-info-success]
  (.-displayName ^js rename-info-success))

(defn set-display-name!
  ^js [rename-info-success value]
  (set! (.-displayName ^js rename-info-success) value))

(defn full-display-name
  ^js [rename-info-success]
  (.-fullDisplayName ^js rename-info-success))

(defn set-full-display-name!
  ^js [rename-info-success value]
  (set! (.-fullDisplayName ^js rename-info-success) value))

(defn kind
  ^js [rename-info-success]
  (.-kind ^js rename-info-success))

(defn set-kind!
  ^js [rename-info-success value]
  (set! (.-kind ^js rename-info-success) value))

(defn kind-modifiers
  ^js [rename-info-success]
  (.-kindModifiers ^js rename-info-success))

(defn set-kind-modifiers!
  ^js [rename-info-success value]
  (set! (.-kindModifiers ^js rename-info-success) value))

(defn trigger-span
  ^js [rename-info-success]
  (.-triggerSpan ^js rename-info-success))

(defn set-trigger-span!
  ^js [rename-info-success value]
  (set! (.-triggerSpan ^js rename-info-success) value))
