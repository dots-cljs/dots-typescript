(ns dots.typescript.js-doc-callback-tag
  (:refer-clojure :exclude [comment name]))

(defn kind
  ^js [js-doc-callback-tag]
  (.-kind ^js js-doc-callback-tag))

(defn parent
  ^js [js-doc-callback-tag]
  (.-parent ^js js-doc-callback-tag))

(defn full-name
  ^js [js-doc-callback-tag]
  (.-fullName ^js js-doc-callback-tag))

(defn name
  ^js [js-doc-callback-tag]
  (.-name ^js js-doc-callback-tag))

(defn type-expression
  ^js [js-doc-callback-tag]
  (.-typeExpression ^js js-doc-callback-tag))

(defn tag-name
  ^js [js-doc-callback-tag]
  (.-tagName ^js js-doc-callback-tag))

(defn comment
  ^js [js-doc-callback-tag]
  (.-comment ^js js-doc-callback-tag))

(defn flags
  ^js [js-doc-callback-tag]
  (.-flags ^js js-doc-callback-tag))

(defn source-file
  ^js [js-doc-callback-tag]
  (.getSourceFile ^js js-doc-callback-tag))

(defn child-count
  (^js [js-doc-callback-tag]
   (.getChildCount ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getChildCount ^js js-doc-callback-tag source-file)))

(defn child-at
  (^js [js-doc-callback-tag index]
   (.getChildAt ^js js-doc-callback-tag index))
  (^js [js-doc-callback-tag index source-file]
   (.getChildAt ^js js-doc-callback-tag index source-file)))

(defn children
  (^js [js-doc-callback-tag]
   (.getChildren ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getChildren ^js js-doc-callback-tag source-file)))

(defn start
  (^js [js-doc-callback-tag]
   (.getStart ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getStart ^js js-doc-callback-tag source-file))
  (^js [js-doc-callback-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-callback-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-callback-tag]
  (.getFullStart ^js js-doc-callback-tag))

(defn get-end
  ^js [js-doc-callback-tag]
  (.getEnd ^js js-doc-callback-tag))

(defn width
  (^js [js-doc-callback-tag]
   (.getWidth ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getWidth ^js js-doc-callback-tag source-file)))

(defn full-width
  ^js [js-doc-callback-tag]
  (.getFullWidth ^js js-doc-callback-tag))

(defn leading-trivia-width
  (^js [js-doc-callback-tag]
   (.getLeadingTriviaWidth ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-callback-tag source-file)))

(defn full-text
  (^js [js-doc-callback-tag]
   (.getFullText ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getFullText ^js js-doc-callback-tag source-file)))

(defn text
  (^js [js-doc-callback-tag]
   (.getText ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getText ^js js-doc-callback-tag source-file)))

(defn first-token
  (^js [js-doc-callback-tag]
   (.getFirstToken ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getFirstToken ^js js-doc-callback-tag source-file)))

(defn last-token
  (^js [js-doc-callback-tag]
   (.getLastToken ^js js-doc-callback-tag))
  (^js [js-doc-callback-tag source-file]
   (.getLastToken ^js js-doc-callback-tag source-file)))

(defn for-each-child
  (^js [js-doc-callback-tag cb-node]
   (.forEachChild ^js js-doc-callback-tag cb-node))
  (^js [js-doc-callback-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-callback-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-callback-tag]
  (.-pos ^js js-doc-callback-tag))

(defn end
  ^js [js-doc-callback-tag]
  (.-end ^js js-doc-callback-tag))
