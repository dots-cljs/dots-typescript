(ns dots.typescript.synthesized-comment)

(defn text
  "**Returns:** `string`"
  ^js [synthesized-comment]
  (.-text ^js synthesized-comment))

(defn set-text!
  ^js [synthesized-comment value]
  (set! (.-text ^js synthesized-comment) value))

(defn pos
  "**Returns:** `-1`"
  ^js [synthesized-comment]
  (.-pos ^js synthesized-comment))

(defn set-pos!
  ^js [synthesized-comment value]
  (set! (.-pos ^js synthesized-comment) value))

(defn end
  "**Returns:** `-1`"
  ^js [synthesized-comment]
  (.-end ^js synthesized-comment))

(defn set-end!
  ^js [synthesized-comment value]
  (set! (.-end ^js synthesized-comment) value))

(defn has-leading-newline?
  "**Returns:** `boolean | undefined`"
  ^js [synthesized-comment]
  (.-hasLeadingNewline ^js synthesized-comment))

(defn set-has-leading-newline!
  ^js [synthesized-comment value]
  (set! (.-hasLeadingNewline ^js synthesized-comment) value))

(defn has-trailing-new-line?
  "**Returns:** `boolean | undefined`"
  ^js [synthesized-comment]
  (.-hasTrailingNewLine ^js synthesized-comment))

(defn set-has-trailing-new-line!
  ^js [synthesized-comment value]
  (set! (.-hasTrailingNewLine ^js synthesized-comment) value))

(defn kind
  "**Returns:** `CommentKind`"
  ^js [synthesized-comment]
  (.-kind ^js synthesized-comment))

(defn set-kind!
  ^js [synthesized-comment value]
  (set! (.-kind ^js synthesized-comment) value))
