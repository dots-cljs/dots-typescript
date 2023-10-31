(ns dots.typescript.inlay-hint)

(defn text
  ^js [inlay-hint]
  (.-text ^js inlay-hint))

(defn set-text!
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
