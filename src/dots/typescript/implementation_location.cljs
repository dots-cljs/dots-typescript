(ns dots.typescript.implementation-location)

(defn kind
  "**Returns:** `ScriptElementKind`"
  ^js [implementation-location]
  (.-kind ^js implementation-location))

(defn set-kind!
  ^js [implementation-location value]
  (set! (.-kind ^js implementation-location) value))

(defn display-parts
  "**Returns:** `SymbolDisplayPart[]`"
  ^js [implementation-location]
  (.-displayParts ^js implementation-location))

(defn set-display-parts!
  ^js [implementation-location value]
  (set! (.-displayParts ^js implementation-location) value))

(defn text-span
  "**Returns:** `TextSpan`"
  ^js [implementation-location]
  (.-textSpan ^js implementation-location))

(defn set-text-span!
  ^js [implementation-location value]
  (set! (.-textSpan ^js implementation-location) value))

(defn file-name
  "**Returns:** `string`"
  ^js [implementation-location]
  (.-fileName ^js implementation-location))

(defn set-file-name!
  ^js [implementation-location value]
  (set! (.-fileName ^js implementation-location) value))

(defn original-text-span
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here
   
   **Returns:** `TextSpan | undefined`"
  ^js [implementation-location]
  (.-originalTextSpan ^js implementation-location))

(defn set-original-text-span!
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [implementation-location value]
  (set! (.-originalTextSpan ^js implementation-location) value))

(defn original-file-name
  "**Returns:** `string | undefined`"
  ^js [implementation-location]
  (.-originalFileName ^js implementation-location))

(defn set-original-file-name!
  ^js [implementation-location value]
  (set! (.-originalFileName ^js implementation-location) value))

(defn context-span
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration
   
   **Returns:** `TextSpan | undefined`"
  ^js [implementation-location]
  (.-contextSpan ^js implementation-location))

(defn set-context-span!
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [implementation-location value]
  (set! (.-contextSpan ^js implementation-location) value))

(defn original-context-span
  "**Returns:** `TextSpan | undefined`"
  ^js [implementation-location]
  (.-originalContextSpan ^js implementation-location))

(defn set-original-context-span!
  ^js [implementation-location value]
  (set! (.-originalContextSpan ^js implementation-location) value))
