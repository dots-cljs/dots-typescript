(ns dots.typescript.reference-entry)

(defn write-access?
  "**Returns:** `boolean`"
  ^js [reference-entry]
  (.-isWriteAccess ^js reference-entry))

(defn set-is-write-access!
  ^js [reference-entry value]
  (set! (.-isWriteAccess ^js reference-entry) value))

(defn in-string
  "**Returns:** `true | undefined`"
  ^js [reference-entry]
  (.-isInString ^js reference-entry))

(defn set-is-in-string!
  ^js [reference-entry value]
  (set! (.-isInString ^js reference-entry) value))

(defn text-span
  "**Returns:** `TextSpan`"
  ^js [reference-entry]
  (.-textSpan ^js reference-entry))

(defn set-text-span!
  ^js [reference-entry value]
  (set! (.-textSpan ^js reference-entry) value))

(defn file-name
  "**Returns:** `string`"
  ^js [reference-entry]
  (.-fileName ^js reference-entry))

(defn set-file-name!
  ^js [reference-entry value]
  (set! (.-fileName ^js reference-entry) value))

(defn original-text-span
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here
   
   **Returns:** `TextSpan | undefined`"
  ^js [reference-entry]
  (.-originalTextSpan ^js reference-entry))

(defn set-original-text-span!
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [reference-entry value]
  (set! (.-originalTextSpan ^js reference-entry) value))

(defn original-file-name
  "**Returns:** `string | undefined`"
  ^js [reference-entry]
  (.-originalFileName ^js reference-entry))

(defn set-original-file-name!
  ^js [reference-entry value]
  (set! (.-originalFileName ^js reference-entry) value))

(defn context-span
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration
   
   **Returns:** `TextSpan | undefined`"
  ^js [reference-entry]
  (.-contextSpan ^js reference-entry))

(defn set-context-span!
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [reference-entry value]
  (set! (.-contextSpan ^js reference-entry) value))

(defn original-context-span
  "**Returns:** `TextSpan | undefined`"
  ^js [reference-entry]
  (.-originalContextSpan ^js reference-entry))

(defn set-original-context-span!
  ^js [reference-entry value]
  (set! (.-originalContextSpan ^js reference-entry) value))
