(ns dots.typescript.js-doc-class-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-class-tag]
  (.-kind ^js js-doc-class-tag))

(defn parent
  ^js [js-doc-class-tag]
  (.-parent ^js js-doc-class-tag))

(defn tag-name
  ^js [js-doc-class-tag]
  (.-tagName ^js js-doc-class-tag))

(defn comment
  ^js [js-doc-class-tag]
  (.-comment ^js js-doc-class-tag))

(defn flags
  ^js [js-doc-class-tag]
  (.-flags ^js js-doc-class-tag))

(defn source-file
  ^js [js-doc-class-tag]
  (.getSourceFile ^js js-doc-class-tag))

(defn child-count
  (^js [js-doc-class-tag]
   (.getChildCount ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getChildCount ^js js-doc-class-tag source-file)))

(defn child-at
  (^js [js-doc-class-tag index]
   (.getChildAt ^js js-doc-class-tag index))
  (^js [js-doc-class-tag index source-file]
   (.getChildAt ^js js-doc-class-tag index source-file)))

(defn children
  (^js [js-doc-class-tag]
   (.getChildren ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getChildren ^js js-doc-class-tag source-file)))

(defn start
  (^js [js-doc-class-tag]
   (.getStart ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getStart ^js js-doc-class-tag source-file))
  (^js [js-doc-class-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-class-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-class-tag]
  (.getFullStart ^js js-doc-class-tag))

(defn get-end
  ^js [js-doc-class-tag]
  (.getEnd ^js js-doc-class-tag))

(defn width
  (^js [js-doc-class-tag]
   (.getWidth ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getWidth ^js js-doc-class-tag source-file)))

(defn full-width
  ^js [js-doc-class-tag]
  (.getFullWidth ^js js-doc-class-tag))

(defn leading-trivia-width
  (^js [js-doc-class-tag]
   (.getLeadingTriviaWidth ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-class-tag source-file)))

(defn full-text
  (^js [js-doc-class-tag]
   (.getFullText ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getFullText ^js js-doc-class-tag source-file)))

(defn text
  (^js [js-doc-class-tag]
   (.getText ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getText ^js js-doc-class-tag source-file)))

(defn first-token
  (^js [js-doc-class-tag]
   (.getFirstToken ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getFirstToken ^js js-doc-class-tag source-file)))

(defn last-token
  (^js [js-doc-class-tag]
   (.getLastToken ^js js-doc-class-tag))
  (^js [js-doc-class-tag source-file]
   (.getLastToken ^js js-doc-class-tag source-file)))

(defn for-each-child
  (^js [js-doc-class-tag cb-node]
   (.forEachChild ^js js-doc-class-tag cb-node))
  (^js [js-doc-class-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-class-tag cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-class-tag]
  (.-decorators ^js js-doc-class-tag))

(defn modifiers
  ^js [js-doc-class-tag]
  (.-modifiers ^js js-doc-class-tag))

(defn pos
  ^js [js-doc-class-tag]
  (.-pos ^js js-doc-class-tag))

(defn end
  ^js [js-doc-class-tag]
  (.-end ^js js-doc-class-tag))
