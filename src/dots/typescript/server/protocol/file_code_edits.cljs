(ns dots.typescript.server.protocol.file-code-edits)

(defn file-name
  ^js [file-code-edits]
  (.-fileName ^js file-code-edits))

(defn set-file-name!
  ^js [file-code-edits value]
  (set! (.-fileName ^js file-code-edits) value))

(defn text-changes
  ^js [file-code-edits]
  (.-textChanges ^js file-code-edits))

(defn set-text-changes!
  ^js [file-code-edits value]
  (set! (.-textChanges ^js file-code-edits) value))
