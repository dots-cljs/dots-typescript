(ns dots.typescript.js-doc-protected-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-protected-tag]
  (.-kind ^js js-doc-protected-tag))

(defn parent
  ^js [js-doc-protected-tag]
  (.-parent ^js js-doc-protected-tag))

(defn tag-name
  ^js [js-doc-protected-tag]
  (.-tagName ^js js-doc-protected-tag))

(defn comment
  ^js [js-doc-protected-tag]
  (.-comment ^js js-doc-protected-tag))

(defn flags
  ^js [js-doc-protected-tag]
  (.-flags ^js js-doc-protected-tag))

(defn source-file
  ^js [js-doc-protected-tag]
  (.getSourceFile ^js js-doc-protected-tag))

(defn child-count
  (^js [js-doc-protected-tag]
   (.getChildCount ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getChildCount ^js js-doc-protected-tag source-file)))

(defn child-at
  (^js [js-doc-protected-tag index]
   (.getChildAt ^js js-doc-protected-tag index))
  (^js [js-doc-protected-tag index source-file]
   (.getChildAt ^js js-doc-protected-tag index source-file)))

(defn children
  (^js [js-doc-protected-tag]
   (.getChildren ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getChildren ^js js-doc-protected-tag source-file)))

(defn start
  (^js [js-doc-protected-tag]
   (.getStart ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getStart ^js js-doc-protected-tag source-file))
  (^js [js-doc-protected-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-protected-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-protected-tag]
  (.getFullStart ^js js-doc-protected-tag))

(defn get-end
  ^js [js-doc-protected-tag]
  (.getEnd ^js js-doc-protected-tag))

(defn width
  (^js [js-doc-protected-tag]
   (.getWidth ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getWidth ^js js-doc-protected-tag source-file)))

(defn full-width
  ^js [js-doc-protected-tag]
  (.getFullWidth ^js js-doc-protected-tag))

(defn leading-trivia-width
  (^js [js-doc-protected-tag]
   (.getLeadingTriviaWidth ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-protected-tag source-file)))

(defn full-text
  (^js [js-doc-protected-tag]
   (.getFullText ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getFullText ^js js-doc-protected-tag source-file)))

(defn text
  (^js [js-doc-protected-tag]
   (.getText ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getText ^js js-doc-protected-tag source-file)))

(defn first-token
  (^js [js-doc-protected-tag]
   (.getFirstToken ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getFirstToken ^js js-doc-protected-tag source-file)))

(defn last-token
  (^js [js-doc-protected-tag]
   (.getLastToken ^js js-doc-protected-tag))
  (^js [js-doc-protected-tag source-file]
   (.getLastToken ^js js-doc-protected-tag source-file)))

(defn for-each-child
  (^js [js-doc-protected-tag cb-node]
   (.forEachChild ^js js-doc-protected-tag cb-node))
  (^js [js-doc-protected-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-protected-tag cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-protected-tag]
  (.-decorators ^js js-doc-protected-tag))

(defn modifiers
  ^js [js-doc-protected-tag]
  (.-modifiers ^js js-doc-protected-tag))

(defn pos
  ^js [js-doc-protected-tag]
  (.-pos ^js js-doc-protected-tag))

(defn end
  ^js [js-doc-protected-tag]
  (.-end ^js js-doc-protected-tag))
