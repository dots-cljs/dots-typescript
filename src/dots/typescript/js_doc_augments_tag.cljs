(ns dots.typescript.js-doc-augments-tag
  "Note that `@extends` is a synonym of `@augments`.
   Both tags are represented by this interface."
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-augments-tag]
  (.-kind ^js js-doc-augments-tag))

(defn class
  ^js [js-doc-augments-tag]
  (.-class ^js js-doc-augments-tag))

(defn parent
  ^js [js-doc-augments-tag]
  (.-parent ^js js-doc-augments-tag))

(defn tag-name
  ^js [js-doc-augments-tag]
  (.-tagName ^js js-doc-augments-tag))

(defn comment
  ^js [js-doc-augments-tag]
  (.-comment ^js js-doc-augments-tag))

(defn flags
  ^js [js-doc-augments-tag]
  (.-flags ^js js-doc-augments-tag))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [js-doc-augments-tag]
  (.getSourceFile ^js js-doc-augments-tag))

(defn child-count
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-augments-tag]
   (.getChildCount ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getChildCount ^js js-doc-augments-tag source-file)))

(defn child-at
  "**Parameters:**
   - `index`: `number`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node`"
  (^js [js-doc-augments-tag index]
   (.getChildAt ^js js-doc-augments-tag index))
  (^js [js-doc-augments-tag index source-file]
   (.getChildAt ^js js-doc-augments-tag index source-file)))

(defn children
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node[]`"
  (^js [js-doc-augments-tag]
   (.getChildren ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getChildren ^js js-doc-augments-tag source-file)))

(defn start
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   - `include-js-doc-comment?`: `boolean | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-augments-tag]
   (.getStart ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getStart ^js js-doc-augments-tag source-file))
  (^js [js-doc-augments-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-augments-tag source-file include-js-doc-comment?)))

(defn full-start
  "**Returns:** `number`"
  ^js [js-doc-augments-tag]
  (.getFullStart ^js js-doc-augments-tag))

(defn get-end
  "**Returns:** `number`"
  ^js [js-doc-augments-tag]
  (.getEnd ^js js-doc-augments-tag))

(defn width
  "**Parameters:**
   - `source-file`: `SourceFileLike | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-augments-tag]
   (.getWidth ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getWidth ^js js-doc-augments-tag source-file)))

(defn full-width
  "**Returns:** `number`"
  ^js [js-doc-augments-tag]
  (.getFullWidth ^js js-doc-augments-tag))

(defn leading-trivia-width
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `number`"
  (^js [js-doc-augments-tag]
   (.getLeadingTriviaWidth ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-augments-tag source-file)))

(defn full-text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-augments-tag]
   (.getFullText ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getFullText ^js js-doc-augments-tag source-file)))

(defn text
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `string`"
  (^js [js-doc-augments-tag]
   (.getText ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getText ^js js-doc-augments-tag source-file)))

(defn first-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-augments-tag]
   (.getFirstToken ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getFirstToken ^js js-doc-augments-tag source-file)))

(defn last-token
  "**Parameters:**
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `Node | undefined`"
  (^js [js-doc-augments-tag]
   (.getLastToken ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getLastToken ^js js-doc-augments-tag source-file)))

(defn for-each-child
  "**Parameters:**
   - `cb-node`: `(node: Node) => T | undefined`
   - `cb-node-array`: `((nodes: NodeArray<Node>) => T | undefined) | undefined`
   
   **Returns:** `T | undefined`"
  (^js [js-doc-augments-tag cb-node]
   (.forEachChild ^js js-doc-augments-tag cb-node))
  (^js [js-doc-augments-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-augments-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-augments-tag]
  (.-pos ^js js-doc-augments-tag))

(defn end
  ^js [js-doc-augments-tag]
  (.-end ^js js-doc-augments-tag))
