(ns dots.typescript.file-text-changes)

(defn file-name
  ^js [file-text-changes]
  (.-fileName ^js file-text-changes))

(defn set-file-name!
  ^js [file-text-changes value]
  (set! (.-fileName ^js file-text-changes) value))

(defn text-changes
  ^js [file-text-changes]
  (.-textChanges ^js file-text-changes))

(defn set-text-changes!
  ^js [file-text-changes value]
  (set! (.-textChanges ^js file-text-changes) value))

(defn new-file?
  ^js [file-text-changes]
  (.-isNewFile ^js file-text-changes))

(defn set-is-new-file!
  ^js [file-text-changes value]
  (set! (.-isNewFile ^js file-text-changes) value))
