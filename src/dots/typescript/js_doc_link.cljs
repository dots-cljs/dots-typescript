(ns dots.typescript.js-doc-link
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [js-doc-link]
  (.-kind ^js js-doc-link))

(defn name
  ^js [js-doc-link]
  (.-name ^js js-doc-link))

(defn text
  ^js [js-doc-link]
  (.-text ^js js-doc-link))

(defn set-text!
  ^js [js-doc-link value]
  (set! (.-text ^js js-doc-link) value))

(defn flags
  ^js [js-doc-link]
  (.-flags ^js js-doc-link))

(defn parent
  ^js [js-doc-link]
  (.-parent ^js js-doc-link))

(defn source-file
  ^js [js-doc-link]
  (.getSourceFile ^js js-doc-link))

(defn child-count
  (^js [js-doc-link]
   (.getChildCount ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getChildCount ^js js-doc-link source-file)))

(defn child-at
  (^js [js-doc-link index]
   (.getChildAt ^js js-doc-link index))
  (^js [js-doc-link index source-file]
   (.getChildAt ^js js-doc-link index source-file)))

(defn children
  (^js [js-doc-link]
   (.getChildren ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getChildren ^js js-doc-link source-file)))

(defn start
  (^js [js-doc-link]
   (.getStart ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getStart ^js js-doc-link source-file))
  (^js [js-doc-link source-file include-js-doc-comment?]
   (.getStart ^js js-doc-link source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-link]
  (.getFullStart ^js js-doc-link))

(defn get-end
  ^js [js-doc-link]
  (.getEnd ^js js-doc-link))

(defn width
  (^js [js-doc-link]
   (.getWidth ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getWidth ^js js-doc-link source-file)))

(defn full-width
  ^js [js-doc-link]
  (.getFullWidth ^js js-doc-link))

(defn leading-trivia-width
  (^js [js-doc-link]
   (.getLeadingTriviaWidth ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getLeadingTriviaWidth ^js js-doc-link source-file)))

(defn full-text
  (^js [js-doc-link]
   (.getFullText ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getFullText ^js js-doc-link source-file)))

(defn get-text
  (^js [js-doc-link]
   (.getText ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getText ^js js-doc-link source-file)))

(defn first-token
  (^js [js-doc-link]
   (.getFirstToken ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getFirstToken ^js js-doc-link source-file)))

(defn last-token
  (^js [js-doc-link]
   (.getLastToken ^js js-doc-link))
  (^js [js-doc-link source-file]
   (.getLastToken ^js js-doc-link source-file)))

(defn for-each-child
  (^js [js-doc-link cb-node]
   (.forEachChild ^js js-doc-link cb-node))
  (^js [js-doc-link cb-node cb-node-array]
   (.forEachChild ^js js-doc-link cb-node cb-node-array)))

(defn pos
  ^js [js-doc-link]
  (.-pos ^js js-doc-link))

(defn end
  ^js [js-doc-link]
  (.-end ^js js-doc-link))
