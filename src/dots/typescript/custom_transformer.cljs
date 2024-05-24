(ns dots.typescript.custom-transformer)

(defn transform-source-file
  "**Parameters:**
   - `node`: `SourceFile`
   
   **Returns:** `SourceFile`"
  ^js [custom-transformer node]
  (.transformSourceFile ^js custom-transformer node))

(defn transform-bundle
  "**Parameters:**
   - `node`: `Bundle`
   
   **Returns:** `Bundle`"
  ^js [custom-transformer node]
  (.transformBundle ^js custom-transformer node))
