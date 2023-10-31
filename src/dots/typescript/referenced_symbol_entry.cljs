(ns dots.typescript.referenced-symbol-entry)

(defn definition?
  ^js [referenced-symbol-entry]
  (.-isDefinition ^js referenced-symbol-entry))

(defn set-is-definition!
  ^js [referenced-symbol-entry value]
  (set! (.-isDefinition ^js referenced-symbol-entry) value))

(defn write-access?
  ^js [referenced-symbol-entry]
  (.-isWriteAccess ^js referenced-symbol-entry))

(defn set-is-write-access!
  ^js [referenced-symbol-entry value]
  (set! (.-isWriteAccess ^js referenced-symbol-entry) value))

(defn in-string
  ^js [referenced-symbol-entry]
  (.-isInString ^js referenced-symbol-entry))

(defn set-is-in-string!
  ^js [referenced-symbol-entry value]
  (set! (.-isInString ^js referenced-symbol-entry) value))

(defn text-span
  ^js [referenced-symbol-entry]
  (.-textSpan ^js referenced-symbol-entry))

(defn set-text-span!
  ^js [referenced-symbol-entry value]
  (set! (.-textSpan ^js referenced-symbol-entry) value))

(defn file-name
  ^js [referenced-symbol-entry]
  (.-fileName ^js referenced-symbol-entry))

(defn set-file-name!
  ^js [referenced-symbol-entry value]
  (set! (.-fileName ^js referenced-symbol-entry) value))

(defn original-text-span
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [referenced-symbol-entry]
  (.-originalTextSpan ^js referenced-symbol-entry))

(defn set-original-text-span!
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [referenced-symbol-entry value]
  (set! (.-originalTextSpan ^js referenced-symbol-entry) value))

(defn original-file-name
  ^js [referenced-symbol-entry]
  (.-originalFileName ^js referenced-symbol-entry))

(defn set-original-file-name!
  ^js [referenced-symbol-entry value]
  (set! (.-originalFileName ^js referenced-symbol-entry) value))

(defn context-span
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [referenced-symbol-entry]
  (.-contextSpan ^js referenced-symbol-entry))

(defn set-context-span!
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [referenced-symbol-entry value]
  (set! (.-contextSpan ^js referenced-symbol-entry) value))

(defn original-context-span
  ^js [referenced-symbol-entry]
  (.-originalContextSpan ^js referenced-symbol-entry))

(defn set-original-context-span!
  ^js [referenced-symbol-entry value]
  (set! (.-originalContextSpan ^js referenced-symbol-entry) value))
