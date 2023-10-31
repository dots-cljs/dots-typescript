(ns dots.typescript.rename-location)

(defn prefix-text
  ^js [rename-location]
  (.-prefixText ^js rename-location))

(defn suffix-text
  ^js [rename-location]
  (.-suffixText ^js rename-location))

(defn text-span
  ^js [rename-location]
  (.-textSpan ^js rename-location))

(defn set-text-span!
  ^js [rename-location value]
  (set! (.-textSpan ^js rename-location) value))

(defn file-name
  ^js [rename-location]
  (.-fileName ^js rename-location))

(defn set-file-name!
  ^js [rename-location value]
  (set! (.-fileName ^js rename-location) value))

(defn original-text-span
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [rename-location]
  (.-originalTextSpan ^js rename-location))

(defn set-original-text-span!
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [rename-location value]
  (set! (.-originalTextSpan ^js rename-location) value))

(defn original-file-name
  ^js [rename-location]
  (.-originalFileName ^js rename-location))

(defn set-original-file-name!
  ^js [rename-location value]
  (set! (.-originalFileName ^js rename-location) value))

(defn context-span
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [rename-location]
  (.-contextSpan ^js rename-location))

(defn set-context-span!
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [rename-location value]
  (set! (.-contextSpan ^js rename-location) value))

(defn original-context-span
  ^js [rename-location]
  (.-originalContextSpan ^js rename-location))

(defn set-original-context-span!
  ^js [rename-location value]
  (set! (.-originalContextSpan ^js rename-location) value))
