(ns dots.typescript.class-element
  (:refer-clojure :exclude [name]))

(defn name
  ^js [class-element]
  (.-name ^js class-element))

(defn kind
  ^js [class-element]
  (.-kind ^js class-element))

(defn flags
  ^js [class-element]
  (.-flags ^js class-element))

(defn parent
  ^js [class-element]
  (.-parent ^js class-element))

(defn source-file
  ^js [class-element]
  (.getSourceFile ^js class-element))

(defn child-count
  (^js [class-element]
   (.getChildCount ^js class-element))
  (^js [class-element source-file]
   (.getChildCount ^js class-element source-file)))

(defn child-at
  (^js [class-element index]
   (.getChildAt ^js class-element index))
  (^js [class-element index source-file]
   (.getChildAt ^js class-element index source-file)))

(defn children
  (^js [class-element]
   (.getChildren ^js class-element))
  (^js [class-element source-file]
   (.getChildren ^js class-element source-file)))

(defn start
  (^js [class-element]
   (.getStart ^js class-element))
  (^js [class-element source-file]
   (.getStart ^js class-element source-file))
  (^js [class-element source-file include-js-doc-comment?]
   (.getStart ^js class-element source-file include-js-doc-comment?)))

(defn full-start
  ^js [class-element]
  (.getFullStart ^js class-element))

(defn get-end
  ^js [class-element]
  (.getEnd ^js class-element))

(defn width
  (^js [class-element]
   (.getWidth ^js class-element))
  (^js [class-element source-file]
   (.getWidth ^js class-element source-file)))

(defn full-width
  ^js [class-element]
  (.getFullWidth ^js class-element))

(defn leading-trivia-width
  (^js [class-element]
   (.getLeadingTriviaWidth ^js class-element))
  (^js [class-element source-file]
   (.getLeadingTriviaWidth ^js class-element source-file)))

(defn full-text
  (^js [class-element]
   (.getFullText ^js class-element))
  (^js [class-element source-file]
   (.getFullText ^js class-element source-file)))

(defn text
  (^js [class-element]
   (.getText ^js class-element))
  (^js [class-element source-file]
   (.getText ^js class-element source-file)))

(defn first-token
  (^js [class-element]
   (.getFirstToken ^js class-element))
  (^js [class-element source-file]
   (.getFirstToken ^js class-element source-file)))

(defn last-token
  (^js [class-element]
   (.getLastToken ^js class-element))
  (^js [class-element source-file]
   (.getLastToken ^js class-element source-file)))

(defn for-each-child
  (^js [class-element cb-node]
   (.forEachChild ^js class-element cb-node))
  (^js [class-element cb-node cb-node-array]
   (.forEachChild ^js class-element cb-node cb-node-array)))

(defn pos
  ^js [class-element]
  (.-pos ^js class-element))

(defn end
  ^js [class-element]
  (.-end ^js class-element))
