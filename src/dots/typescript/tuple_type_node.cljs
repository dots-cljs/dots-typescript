(ns dots.typescript.tuple-type-node)

(defn kind
  ^js [tuple-type-node]
  (.-kind ^js tuple-type-node))

(defn elements
  ^js [tuple-type-node]
  (.-elements ^js tuple-type-node))

(defn flags
  ^js [tuple-type-node]
  (.-flags ^js tuple-type-node))

(defn parent
  ^js [tuple-type-node]
  (.-parent ^js tuple-type-node))

(defn source-file
  ^js [tuple-type-node]
  (.getSourceFile ^js tuple-type-node))

(defn child-count
  (^js [tuple-type-node]
   (.getChildCount ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getChildCount ^js tuple-type-node source-file)))

(defn child-at
  (^js [tuple-type-node index]
   (.getChildAt ^js tuple-type-node index))
  (^js [tuple-type-node index source-file]
   (.getChildAt ^js tuple-type-node index source-file)))

(defn children
  (^js [tuple-type-node]
   (.getChildren ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getChildren ^js tuple-type-node source-file)))

(defn start
  (^js [tuple-type-node]
   (.getStart ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getStart ^js tuple-type-node source-file))
  (^js [tuple-type-node source-file include-js-doc-comment?]
   (.getStart ^js tuple-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [tuple-type-node]
  (.getFullStart ^js tuple-type-node))

(defn get-end
  ^js [tuple-type-node]
  (.getEnd ^js tuple-type-node))

(defn width
  (^js [tuple-type-node]
   (.getWidth ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getWidth ^js tuple-type-node source-file)))

(defn full-width
  ^js [tuple-type-node]
  (.getFullWidth ^js tuple-type-node))

(defn leading-trivia-width
  (^js [tuple-type-node]
   (.getLeadingTriviaWidth ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getLeadingTriviaWidth ^js tuple-type-node source-file)))

(defn full-text
  (^js [tuple-type-node]
   (.getFullText ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getFullText ^js tuple-type-node source-file)))

(defn text
  (^js [tuple-type-node]
   (.getText ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getText ^js tuple-type-node source-file)))

(defn first-token
  (^js [tuple-type-node]
   (.getFirstToken ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getFirstToken ^js tuple-type-node source-file)))

(defn last-token
  (^js [tuple-type-node]
   (.getLastToken ^js tuple-type-node))
  (^js [tuple-type-node source-file]
   (.getLastToken ^js tuple-type-node source-file)))

(defn for-each-child
  (^js [tuple-type-node cb-node]
   (.forEachChild ^js tuple-type-node cb-node))
  (^js [tuple-type-node cb-node cb-node-array]
   (.forEachChild ^js tuple-type-node cb-node cb-node-array)))

(defn decorators
  ^js [tuple-type-node]
  (.-decorators ^js tuple-type-node))

(defn modifiers
  ^js [tuple-type-node]
  (.-modifiers ^js tuple-type-node))

(defn pos
  ^js [tuple-type-node]
  (.-pos ^js tuple-type-node))

(defn end
  ^js [tuple-type-node]
  (.-end ^js tuple-type-node))
