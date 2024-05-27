(ns dots.typescript.definition-info
  (:refer-clojure :exclude [name]))

(defn kind
  "**Returns:** `ScriptElementKind`"
  ^js [definition-info]
  (.-kind ^js definition-info))

(defn set-kind!
  ^js [definition-info value]
  (set! (.-kind ^js definition-info) value))

(defn name
  "**Returns:** `string`"
  ^js [definition-info]
  (.-name ^js definition-info))

(defn set-name!
  ^js [definition-info value]
  (set! (.-name ^js definition-info) value))

(defn container-kind
  "**Returns:** `ScriptElementKind`"
  ^js [definition-info]
  (.-containerKind ^js definition-info))

(defn set-container-kind!
  ^js [definition-info value]
  (set! (.-containerKind ^js definition-info) value))

(defn container-name
  "**Returns:** `string`"
  ^js [definition-info]
  (.-containerName ^js definition-info))

(defn set-container-name!
  ^js [definition-info value]
  (set! (.-containerName ^js definition-info) value))

(defn unverified?
  "**Returns:** `boolean | undefined`"
  ^js [definition-info]
  (.-unverified ^js definition-info))

(defn set-unverified!
  ^js [definition-info value]
  (set! (.-unverified ^js definition-info) value))

(defn text-span
  "**Returns:** `TextSpan`"
  ^js [definition-info]
  (.-textSpan ^js definition-info))

(defn set-text-span!
  ^js [definition-info value]
  (set! (.-textSpan ^js definition-info) value))

(defn file-name
  "**Returns:** `string`"
  ^js [definition-info]
  (.-fileName ^js definition-info))

(defn set-file-name!
  ^js [definition-info value]
  (set! (.-fileName ^js definition-info) value))

(defn original-text-span
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here
   
   **Returns:** `TextSpan | undefined`"
  ^js [definition-info]
  (.-originalTextSpan ^js definition-info))

(defn set-original-text-span!
  "If the span represents a location that was remapped (e.g. via a .d.ts.map file),
   then the original filename and span will be specified here"
  ^js [definition-info value]
  (set! (.-originalTextSpan ^js definition-info) value))

(defn original-file-name
  "**Returns:** `string | undefined`"
  ^js [definition-info]
  (.-originalFileName ^js definition-info))

(defn set-original-file-name!
  ^js [definition-info value]
  (set! (.-originalFileName ^js definition-info) value))

(defn context-span
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration
   
   **Returns:** `TextSpan | undefined`"
  ^js [definition-info]
  (.-contextSpan ^js definition-info))

(defn set-context-span!
  "If DocumentSpan.textSpan is the span for name of the declaration,
   then this is the span for relevant declaration"
  ^js [definition-info value]
  (set! (.-contextSpan ^js definition-info) value))

(defn original-context-span
  "**Returns:** `TextSpan | undefined`"
  ^js [definition-info]
  (.-originalContextSpan ^js definition-info))

(defn set-original-context-span!
  ^js [definition-info value]
  (set! (.-originalContextSpan ^js definition-info) value))
