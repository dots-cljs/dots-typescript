(ns dots.typescript.js-doc-return-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-return-tag]
  (.-kind ^js js-doc-return-tag))

(defn type-expression
  ^js [js-doc-return-tag]
  (.-typeExpression ^js js-doc-return-tag))

(defn parent
  ^js [js-doc-return-tag]
  (.-parent ^js js-doc-return-tag))

(defn tag-name
  ^js [js-doc-return-tag]
  (.-tagName ^js js-doc-return-tag))

(defn comment
  ^js [js-doc-return-tag]
  (.-comment ^js js-doc-return-tag))

(defn flags
  ^js [js-doc-return-tag]
  (.-flags ^js js-doc-return-tag))

(defn source-file
  ^js [js-doc-return-tag]
  (.getSourceFile ^js js-doc-return-tag))

(defn child-count
  (^js [js-doc-return-tag]
   (.getChildCount ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getChildCount ^js js-doc-return-tag source-file)))

(defn child-at
  (^js [js-doc-return-tag index]
   (.getChildAt ^js js-doc-return-tag index))
  (^js [js-doc-return-tag index source-file]
   (.getChildAt ^js js-doc-return-tag index source-file)))

(defn children
  (^js [js-doc-return-tag]
   (.getChildren ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getChildren ^js js-doc-return-tag source-file)))

(defn start
  (^js [js-doc-return-tag]
   (.getStart ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getStart ^js js-doc-return-tag source-file))
  (^js [js-doc-return-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-return-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-return-tag]
  (.getFullStart ^js js-doc-return-tag))

(defn get-end
  ^js [js-doc-return-tag]
  (.getEnd ^js js-doc-return-tag))

(defn width
  (^js [js-doc-return-tag]
   (.getWidth ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getWidth ^js js-doc-return-tag source-file)))

(defn full-width
  ^js [js-doc-return-tag]
  (.getFullWidth ^js js-doc-return-tag))

(defn leading-trivia-width
  (^js [js-doc-return-tag]
   (.getLeadingTriviaWidth ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-return-tag source-file)))

(defn full-text
  (^js [js-doc-return-tag]
   (.getFullText ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getFullText ^js js-doc-return-tag source-file)))

(defn text
  (^js [js-doc-return-tag]
   (.getText ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getText ^js js-doc-return-tag source-file)))

(defn first-token
  (^js [js-doc-return-tag]
   (.getFirstToken ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getFirstToken ^js js-doc-return-tag source-file)))

(defn last-token
  (^js [js-doc-return-tag]
   (.getLastToken ^js js-doc-return-tag))
  (^js [js-doc-return-tag source-file]
   (.getLastToken ^js js-doc-return-tag source-file)))

(defn for-each-child
  (^js [js-doc-return-tag cb-node]
   (.forEachChild ^js js-doc-return-tag cb-node))
  (^js [js-doc-return-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-return-tag cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-return-tag]
  (.-decorators ^js js-doc-return-tag))

(defn modifiers
  ^js [js-doc-return-tag]
  (.-modifiers ^js js-doc-return-tag))

(defn pos
  ^js [js-doc-return-tag]
  (.-pos ^js js-doc-return-tag))

(defn end
  ^js [js-doc-return-tag]
  (.-end ^js js-doc-return-tag))
