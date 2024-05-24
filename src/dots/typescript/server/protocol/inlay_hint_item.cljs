(ns dots.typescript.server.protocol.inlay-hint-item)

(defn text
  "This property will be the empty string when displayParts is set."
  ^js [inlay-hint-item]
  (.-text ^js inlay-hint-item))

(defn set-text!
  "This property will be the empty string when displayParts is set."
  ^js [inlay-hint-item value]
  (set! (.-text ^js inlay-hint-item) value))

(defn position
  ^js [inlay-hint-item]
  (.-position ^js inlay-hint-item))

(defn set-position!
  ^js [inlay-hint-item value]
  (set! (.-position ^js inlay-hint-item) value))

(defn kind
  ^js [inlay-hint-item]
  (.-kind ^js inlay-hint-item))

(defn set-kind!
  ^js [inlay-hint-item value]
  (set! (.-kind ^js inlay-hint-item) value))

(defn whitespace-before?
  ^js [inlay-hint-item]
  (.-whitespaceBefore ^js inlay-hint-item))

(defn set-whitespace-before!
  ^js [inlay-hint-item value]
  (set! (.-whitespaceBefore ^js inlay-hint-item) value))

(defn whitespace-after?
  ^js [inlay-hint-item]
  (.-whitespaceAfter ^js inlay-hint-item))

(defn set-whitespace-after!
  ^js [inlay-hint-item value]
  (set! (.-whitespaceAfter ^js inlay-hint-item) value))

(defn display-parts
  ^js [inlay-hint-item]
  (.-displayParts ^js inlay-hint-item))

(defn set-display-parts!
  ^js [inlay-hint-item value]
  (set! (.-displayParts ^js inlay-hint-item) value))
