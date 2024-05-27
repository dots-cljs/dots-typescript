(ns dots.typescript.inlay-hint)

(defn text
  "This property will be the empty string when displayParts is set.
   
   **Returns:** `string`"
  ^js [inlay-hint]
  (.-text ^js inlay-hint))

(defn set-text!
  "This property will be the empty string when displayParts is set."
  ^js [inlay-hint value]
  (set! (.-text ^js inlay-hint) value))

(defn position
  "**Returns:** `number`"
  ^js [inlay-hint]
  (.-position ^js inlay-hint))

(defn set-position!
  ^js [inlay-hint value]
  (set! (.-position ^js inlay-hint) value))

(defn kind
  "**Returns:** `InlayHintKind`"
  ^js [inlay-hint]
  (.-kind ^js inlay-hint))

(defn set-kind!
  ^js [inlay-hint value]
  (set! (.-kind ^js inlay-hint) value))

(defn whitespace-before?
  "**Returns:** `boolean | undefined`"
  ^js [inlay-hint]
  (.-whitespaceBefore ^js inlay-hint))

(defn set-whitespace-before!
  ^js [inlay-hint value]
  (set! (.-whitespaceBefore ^js inlay-hint) value))

(defn whitespace-after?
  "**Returns:** `boolean | undefined`"
  ^js [inlay-hint]
  (.-whitespaceAfter ^js inlay-hint))

(defn set-whitespace-after!
  ^js [inlay-hint value]
  (set! (.-whitespaceAfter ^js inlay-hint) value))

(defn display-parts
  "**Returns:** `InlayHintDisplayPart[] | undefined`"
  ^js [inlay-hint]
  (.-displayParts ^js inlay-hint))

(defn set-display-parts!
  ^js [inlay-hint value]
  (set! (.-displayParts ^js inlay-hint) value))
