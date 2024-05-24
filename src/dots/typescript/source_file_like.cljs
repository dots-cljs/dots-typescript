(ns dots.typescript.source-file-like
  "Subset of properties from SourceFile that are used in multiple utility functions")

(defn text
  ^js [source-file-like]
  (.-text ^js source-file-like))

(defn line-and-character-of-position
  "**Parameters:**
   - `pos`: `number`
   
   **Returns:** `LineAndCharacter`"
  ^js [source-file-like pos]
  (.getLineAndCharacterOfPosition ^js source-file-like pos))
