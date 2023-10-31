(ns dots.typescript.js-doc-type-literal)

(defn kind
  ^js [js-doc-type-literal]
  (.-kind ^js js-doc-type-literal))

(defn js-doc-property-tags
  ^js [js-doc-type-literal]
  (.-jsDocPropertyTags ^js js-doc-type-literal))

(defn array-type?
  "If true, then this type literal represents an *array* of its type."
  ^js [js-doc-type-literal]
  (.-isArrayType ^js js-doc-type-literal))

(defn flags
  ^js [js-doc-type-literal]
  (.-flags ^js js-doc-type-literal))

(defn parent
  ^js [js-doc-type-literal]
  (.-parent ^js js-doc-type-literal))

(defn source-file
  ^js [js-doc-type-literal]
  (.getSourceFile ^js js-doc-type-literal))

(defn child-count
  (^js [js-doc-type-literal]
   (.getChildCount ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getChildCount ^js js-doc-type-literal source-file)))

(defn child-at
  (^js [js-doc-type-literal index]
   (.getChildAt ^js js-doc-type-literal index))
  (^js [js-doc-type-literal index source-file]
   (.getChildAt ^js js-doc-type-literal index source-file)))

(defn children
  (^js [js-doc-type-literal]
   (.getChildren ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getChildren ^js js-doc-type-literal source-file)))

(defn start
  (^js [js-doc-type-literal]
   (.getStart ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getStart ^js js-doc-type-literal source-file))
  (^js [js-doc-type-literal source-file include-js-doc-comment?]
   (.getStart ^js js-doc-type-literal source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-type-literal]
  (.getFullStart ^js js-doc-type-literal))

(defn get-end
  ^js [js-doc-type-literal]
  (.getEnd ^js js-doc-type-literal))

(defn width
  (^js [js-doc-type-literal]
   (.getWidth ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getWidth ^js js-doc-type-literal source-file)))

(defn full-width
  ^js [js-doc-type-literal]
  (.getFullWidth ^js js-doc-type-literal))

(defn leading-trivia-width
  (^js [js-doc-type-literal]
   (.getLeadingTriviaWidth ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getLeadingTriviaWidth ^js js-doc-type-literal source-file)))

(defn full-text
  (^js [js-doc-type-literal]
   (.getFullText ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getFullText ^js js-doc-type-literal source-file)))

(defn text
  (^js [js-doc-type-literal]
   (.getText ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getText ^js js-doc-type-literal source-file)))

(defn first-token
  (^js [js-doc-type-literal]
   (.getFirstToken ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getFirstToken ^js js-doc-type-literal source-file)))

(defn last-token
  (^js [js-doc-type-literal]
   (.getLastToken ^js js-doc-type-literal))
  (^js [js-doc-type-literal source-file]
   (.getLastToken ^js js-doc-type-literal source-file)))

(defn for-each-child
  (^js [js-doc-type-literal cb-node]
   (.forEachChild ^js js-doc-type-literal cb-node))
  (^js [js-doc-type-literal cb-node cb-node-array]
   (.forEachChild ^js js-doc-type-literal cb-node cb-node-array)))

(defn pos
  ^js [js-doc-type-literal]
  (.-pos ^js js-doc-type-literal))

(defn end
  ^js [js-doc-type-literal]
  (.-end ^js js-doc-type-literal))
