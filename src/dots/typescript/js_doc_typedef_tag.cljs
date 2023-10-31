(ns dots.typescript.js-doc-typedef-tag
  (:refer-clojure :exclude [comment name]))

(defn kind
  ^js [js-doc-typedef-tag]
  (.-kind ^js js-doc-typedef-tag))

(defn parent
  ^js [js-doc-typedef-tag]
  (.-parent ^js js-doc-typedef-tag))

(defn full-name
  ^js [js-doc-typedef-tag]
  (.-fullName ^js js-doc-typedef-tag))

(defn name
  ^js [js-doc-typedef-tag]
  (.-name ^js js-doc-typedef-tag))

(defn type-expression
  ^js [js-doc-typedef-tag]
  (.-typeExpression ^js js-doc-typedef-tag))

(defn tag-name
  ^js [js-doc-typedef-tag]
  (.-tagName ^js js-doc-typedef-tag))

(defn comment
  ^js [js-doc-typedef-tag]
  (.-comment ^js js-doc-typedef-tag))

(defn flags
  ^js [js-doc-typedef-tag]
  (.-flags ^js js-doc-typedef-tag))

(defn source-file
  ^js [js-doc-typedef-tag]
  (.getSourceFile ^js js-doc-typedef-tag))

(defn child-count
  (^js [js-doc-typedef-tag]
   (.getChildCount ^js js-doc-typedef-tag))
  (^js [js-doc-typedef-tag source-file]
   (.getChildCount ^js js-doc-typedef-tag source-file)))

(defn child-at
  (^js [js-doc-typedef-tag index]
   (.getChildAt ^js js-doc-typedef-tag index))
  (^js [js-doc-typedef-tag index source-file]
   (.getChildAt ^js js-doc-typedef-tag index source-file)))

(defn children
  (^js [js-doc-typedef-tag]
   (.getChildren ^js js-doc-typedef-tag))
  (^js [js-doc-typedef-tag source-file]
   (.getChildren ^js js-doc-typedef-tag source-file)))

(defn start
  (^js [js-doc-typedef-tag]
   (.getStart ^js js-doc-typedef-tag))
  (^js [js-doc-typedef-tag source-file]
   (.getStart ^js js-doc-typedef-tag source-file))
  (^js [js-doc-typedef-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-typedef-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-typedef-tag]
  (.getFullStart ^js js-doc-typedef-tag))

(defn get-end
  ^js [js-doc-typedef-tag]
  (.getEnd ^js js-doc-typedef-tag))

(defn width
  (^js [js-doc-typedef-tag]
   (.getWidth ^js js-doc-typedef-tag))
  (^js [js-doc-typedef-tag source-file]
   (.getWidth ^js js-doc-typedef-tag source-file)))

(defn full-width
  ^js [js-doc-typedef-tag]
  (.getFullWidth ^js js-doc-typedef-tag))

(defn leading-trivia-width
  (^js [js-doc-typedef-tag]
   (.getLeadingTriviaWidth ^js js-doc-typedef-tag))
  (^js [js-doc-typedef-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-typedef-tag source-file)))

(defn full-text
  (^js [js-doc-typedef-tag]
   (.getFullText ^js js-doc-typedef-tag))
  (^js [js-doc-typedef-tag source-file]
   (.getFullText ^js js-doc-typedef-tag source-file)))

(defn text
  (^js [js-doc-typedef-tag]
   (.getText ^js js-doc-typedef-tag))
  (^js [js-doc-typedef-tag source-file]
   (.getText ^js js-doc-typedef-tag source-file)))

(defn first-token
  (^js [js-doc-typedef-tag]
   (.getFirstToken ^js js-doc-typedef-tag))
  (^js [js-doc-typedef-tag source-file]
   (.getFirstToken ^js js-doc-typedef-tag source-file)))

(defn last-token
  (^js [js-doc-typedef-tag]
   (.getLastToken ^js js-doc-typedef-tag))
  (^js [js-doc-typedef-tag source-file]
   (.getLastToken ^js js-doc-typedef-tag source-file)))

(defn for-each-child
  (^js [js-doc-typedef-tag cb-node]
   (.forEachChild ^js js-doc-typedef-tag cb-node))
  (^js [js-doc-typedef-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-typedef-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-typedef-tag]
  (.-pos ^js js-doc-typedef-tag))

(defn end
  ^js [js-doc-typedef-tag]
  (.-end ^js js-doc-typedef-tag))
