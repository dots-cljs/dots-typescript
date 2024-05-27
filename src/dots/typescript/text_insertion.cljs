(ns dots.typescript.text-insertion)

(defn new-text
  "**Returns:** `string`"
  ^js [text-insertion]
  (.-newText ^js text-insertion))

(defn set-new-text!
  ^js [text-insertion value]
  (set! (.-newText ^js text-insertion) value))

(defn caret-offset
  "The position in newText the caret should point to after the insertion.
   
   **Returns:** `number`"
  ^js [text-insertion]
  (.-caretOffset ^js text-insertion))

(defn set-caret-offset!
  "The position in newText the caret should point to after the insertion."
  ^js [text-insertion value]
  (set! (.-caretOffset ^js text-insertion) value))
