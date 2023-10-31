(ns dots.typescript.js-doc-type-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-type-tag]
  (.-kind ^js js-doc-type-tag))

(defn type-expression
  ^js [js-doc-type-tag]
  (.-typeExpression ^js js-doc-type-tag))

(defn parent
  ^js [js-doc-type-tag]
  (.-parent ^js js-doc-type-tag))

(defn tag-name
  ^js [js-doc-type-tag]
  (.-tagName ^js js-doc-type-tag))

(defn comment
  ^js [js-doc-type-tag]
  (.-comment ^js js-doc-type-tag))

(defn flags
  ^js [js-doc-type-tag]
  (.-flags ^js js-doc-type-tag))

(defn source-file
  ^js [js-doc-type-tag]
  (.getSourceFile ^js js-doc-type-tag))

(defn child-count
  (^js [js-doc-type-tag]
   (.getChildCount ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getChildCount ^js js-doc-type-tag source-file)))

(defn child-at
  (^js [js-doc-type-tag index]
   (.getChildAt ^js js-doc-type-tag index))
  (^js [js-doc-type-tag index source-file]
   (.getChildAt ^js js-doc-type-tag index source-file)))

(defn children
  (^js [js-doc-type-tag]
   (.getChildren ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getChildren ^js js-doc-type-tag source-file)))

(defn start
  (^js [js-doc-type-tag]
   (.getStart ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getStart ^js js-doc-type-tag source-file))
  (^js [js-doc-type-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-type-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-type-tag]
  (.getFullStart ^js js-doc-type-tag))

(defn get-end
  ^js [js-doc-type-tag]
  (.getEnd ^js js-doc-type-tag))

(defn width
  (^js [js-doc-type-tag]
   (.getWidth ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getWidth ^js js-doc-type-tag source-file)))

(defn full-width
  ^js [js-doc-type-tag]
  (.getFullWidth ^js js-doc-type-tag))

(defn leading-trivia-width
  (^js [js-doc-type-tag]
   (.getLeadingTriviaWidth ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-type-tag source-file)))

(defn full-text
  (^js [js-doc-type-tag]
   (.getFullText ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getFullText ^js js-doc-type-tag source-file)))

(defn text
  (^js [js-doc-type-tag]
   (.getText ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getText ^js js-doc-type-tag source-file)))

(defn first-token
  (^js [js-doc-type-tag]
   (.getFirstToken ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getFirstToken ^js js-doc-type-tag source-file)))

(defn last-token
  (^js [js-doc-type-tag]
   (.getLastToken ^js js-doc-type-tag))
  (^js [js-doc-type-tag source-file]
   (.getLastToken ^js js-doc-type-tag source-file)))

(defn for-each-child
  (^js [js-doc-type-tag cb-node]
   (.forEachChild ^js js-doc-type-tag cb-node))
  (^js [js-doc-type-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-type-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-type-tag]
  (.-pos ^js js-doc-type-tag))

(defn end
  ^js [js-doc-type-tag]
  (.-end ^js js-doc-type-tag))
