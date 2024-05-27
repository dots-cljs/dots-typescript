(ns dots.typescript.quick-info)

(defn kind
  "**Returns:** `ScriptElementKind`"
  ^js [quick-info]
  (.-kind ^js quick-info))

(defn set-kind!
  ^js [quick-info value]
  (set! (.-kind ^js quick-info) value))

(defn kind-modifiers
  "**Returns:** `string`"
  ^js [quick-info]
  (.-kindModifiers ^js quick-info))

(defn set-kind-modifiers!
  ^js [quick-info value]
  (set! (.-kindModifiers ^js quick-info) value))

(defn text-span
  "**Returns:** `TextSpan`"
  ^js [quick-info]
  (.-textSpan ^js quick-info))

(defn set-text-span!
  ^js [quick-info value]
  (set! (.-textSpan ^js quick-info) value))

(defn display-parts
  "**Returns:** `SymbolDisplayPart[] | undefined`"
  ^js [quick-info]
  (.-displayParts ^js quick-info))

(defn set-display-parts!
  ^js [quick-info value]
  (set! (.-displayParts ^js quick-info) value))

(defn documentation
  "**Returns:** `SymbolDisplayPart[] | undefined`"
  ^js [quick-info]
  (.-documentation ^js quick-info))

(defn set-documentation!
  ^js [quick-info value]
  (set! (.-documentation ^js quick-info) value))

(defn tags
  "**Returns:** `JSDocTagInfo[] | undefined`"
  ^js [quick-info]
  (.-tags ^js quick-info))

(defn set-tags!
  ^js [quick-info value]
  (set! (.-tags ^js quick-info) value))
