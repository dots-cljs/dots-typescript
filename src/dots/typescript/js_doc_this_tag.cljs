(ns dots.typescript.js-doc-this-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-this-tag]
  (.-kind ^js js-doc-this-tag))

(defn type-expression
  ^js [js-doc-this-tag]
  (.-typeExpression ^js js-doc-this-tag))

(defn parent
  ^js [js-doc-this-tag]
  (.-parent ^js js-doc-this-tag))

(defn tag-name
  ^js [js-doc-this-tag]
  (.-tagName ^js js-doc-this-tag))

(defn comment
  ^js [js-doc-this-tag]
  (.-comment ^js js-doc-this-tag))

(defn flags
  ^js [js-doc-this-tag]
  (.-flags ^js js-doc-this-tag))

(defn source-file
  ^js [js-doc-this-tag]
  (.getSourceFile ^js js-doc-this-tag))

(defn child-count
  (^js [js-doc-this-tag]
   (.getChildCount ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getChildCount ^js js-doc-this-tag source-file)))

(defn child-at
  (^js [js-doc-this-tag index]
   (.getChildAt ^js js-doc-this-tag index))
  (^js [js-doc-this-tag index source-file]
   (.getChildAt ^js js-doc-this-tag index source-file)))

(defn children
  (^js [js-doc-this-tag]
   (.getChildren ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getChildren ^js js-doc-this-tag source-file)))

(defn start
  (^js [js-doc-this-tag]
   (.getStart ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getStart ^js js-doc-this-tag source-file))
  (^js [js-doc-this-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-this-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-this-tag]
  (.getFullStart ^js js-doc-this-tag))

(defn get-end
  ^js [js-doc-this-tag]
  (.getEnd ^js js-doc-this-tag))

(defn width
  (^js [js-doc-this-tag]
   (.getWidth ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getWidth ^js js-doc-this-tag source-file)))

(defn full-width
  ^js [js-doc-this-tag]
  (.getFullWidth ^js js-doc-this-tag))

(defn leading-trivia-width
  (^js [js-doc-this-tag]
   (.getLeadingTriviaWidth ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-this-tag source-file)))

(defn full-text
  (^js [js-doc-this-tag]
   (.getFullText ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getFullText ^js js-doc-this-tag source-file)))

(defn text
  (^js [js-doc-this-tag]
   (.getText ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getText ^js js-doc-this-tag source-file)))

(defn first-token
  (^js [js-doc-this-tag]
   (.getFirstToken ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getFirstToken ^js js-doc-this-tag source-file)))

(defn last-token
  (^js [js-doc-this-tag]
   (.getLastToken ^js js-doc-this-tag))
  (^js [js-doc-this-tag source-file]
   (.getLastToken ^js js-doc-this-tag source-file)))

(defn for-each-child
  (^js [js-doc-this-tag cb-node]
   (.forEachChild ^js js-doc-this-tag cb-node))
  (^js [js-doc-this-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-this-tag cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-this-tag]
  (.-decorators ^js js-doc-this-tag))

(defn modifiers
  ^js [js-doc-this-tag]
  (.-modifiers ^js js-doc-this-tag))

(defn pos
  ^js [js-doc-this-tag]
  (.-pos ^js js-doc-this-tag))

(defn end
  ^js [js-doc-this-tag]
  (.-end ^js js-doc-this-tag))
