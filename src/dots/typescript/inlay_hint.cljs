(ns dots.typescript.inlay-hint)

(defn text
  "This property will be the empty string when displayParts is set."
  ^js [inlay-hint]
  (.-text ^js inlay-hint))

(defn set-text!
  "This property will be the empty string when displayParts is set."
  ^js [inlay-hint value]
  (set! (.-text ^js inlay-hint) value))

(defn position
  ^js [inlay-hint]
  (.-position ^js inlay-hint))

(defn set-position!
  ^js [inlay-hint value]
  (set! (.-position ^js inlay-hint) value))

(defn kind
  ^js [inlay-hint]
  (.-kind ^js inlay-hint))

(defn set-kind!
  ^js [inlay-hint value]
  (set! (.-kind ^js inlay-hint) value))

(defn whitespace-before?
  ^js [inlay-hint]
  (.-whitespaceBefore ^js inlay-hint))

(defn set-whitespace-before!
  ^js [inlay-hint value]
  (set! (.-whitespaceBefore ^js inlay-hint) value))

(defn whitespace-after?
  ^js [inlay-hint]
  (.-whitespaceAfter ^js inlay-hint))

(defn set-whitespace-after!
  ^js [inlay-hint value]
  (set! (.-whitespaceAfter ^js inlay-hint) value))

(defn display-parts
  ^js [inlay-hint]
  (.-displayParts ^js inlay-hint))

(defn set-display-parts!
  ^js [inlay-hint value]
  (set! (.-displayParts ^js inlay-hint) value))
