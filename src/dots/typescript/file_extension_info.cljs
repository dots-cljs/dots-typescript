(ns dots.typescript.file-extension-info)

(defn extension
  "**Returns:** `string`"
  ^js [file-extension-info]
  (.-extension ^js file-extension-info))

(defn set-extension!
  ^js [file-extension-info value]
  (set! (.-extension ^js file-extension-info) value))

(defn mixed-content?
  "**Returns:** `boolean`"
  ^js [file-extension-info]
  (.-isMixedContent ^js file-extension-info))

(defn set-is-mixed-content!
  ^js [file-extension-info value]
  (set! (.-isMixedContent ^js file-extension-info) value))

(defn script-kind
  "**Returns:** `ScriptKind | undefined`"
  ^js [file-extension-info]
  (.-scriptKind ^js file-extension-info))

(defn set-script-kind!
  ^js [file-extension-info value]
  (set! (.-scriptKind ^js file-extension-info) value))
