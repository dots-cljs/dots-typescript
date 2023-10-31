(ns dots.typescript.js-doc-namespace-declaration
  (:refer-clojure :exclude [name]))

(defn name
  ^js [js-doc-namespace-declaration]
  (.-name ^js js-doc-namespace-declaration))

(defn body
  ^js [js-doc-namespace-declaration]
  (.-body ^js js-doc-namespace-declaration))

(defn kind
  ^js [js-doc-namespace-declaration]
  (.-kind ^js js-doc-namespace-declaration))

(defn parent
  ^js [js-doc-namespace-declaration]
  (.-parent ^js js-doc-namespace-declaration))

(defn modifiers
  ^js [js-doc-namespace-declaration]
  (.-modifiers ^js js-doc-namespace-declaration))

(defn flags
  ^js [js-doc-namespace-declaration]
  (.-flags ^js js-doc-namespace-declaration))

(defn source-file
  ^js [js-doc-namespace-declaration]
  (.getSourceFile ^js js-doc-namespace-declaration))

(defn child-count
  (^js [js-doc-namespace-declaration]
   (.getChildCount ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getChildCount ^js js-doc-namespace-declaration source-file)))

(defn child-at
  (^js [js-doc-namespace-declaration index]
   (.getChildAt ^js js-doc-namespace-declaration index))
  (^js [js-doc-namespace-declaration index source-file]
   (.getChildAt ^js js-doc-namespace-declaration index source-file)))

(defn children
  (^js [js-doc-namespace-declaration]
   (.getChildren ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getChildren ^js js-doc-namespace-declaration source-file)))

(defn start
  (^js [js-doc-namespace-declaration]
   (.getStart ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getStart ^js js-doc-namespace-declaration source-file))
  (^js [js-doc-namespace-declaration source-file include-js-doc-comment?]
   (.getStart ^js js-doc-namespace-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-namespace-declaration]
  (.getFullStart ^js js-doc-namespace-declaration))

(defn get-end
  ^js [js-doc-namespace-declaration]
  (.getEnd ^js js-doc-namespace-declaration))

(defn width
  (^js [js-doc-namespace-declaration]
   (.getWidth ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getWidth ^js js-doc-namespace-declaration source-file)))

(defn full-width
  ^js [js-doc-namespace-declaration]
  (.getFullWidth ^js js-doc-namespace-declaration))

(defn leading-trivia-width
  (^js [js-doc-namespace-declaration]
   (.getLeadingTriviaWidth ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getLeadingTriviaWidth ^js js-doc-namespace-declaration source-file)))

(defn full-text
  (^js [js-doc-namespace-declaration]
   (.getFullText ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getFullText ^js js-doc-namespace-declaration source-file)))

(defn text
  (^js [js-doc-namespace-declaration]
   (.getText ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getText ^js js-doc-namespace-declaration source-file)))

(defn first-token
  (^js [js-doc-namespace-declaration]
   (.getFirstToken ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getFirstToken ^js js-doc-namespace-declaration source-file)))

(defn last-token
  (^js [js-doc-namespace-declaration]
   (.getLastToken ^js js-doc-namespace-declaration))
  (^js [js-doc-namespace-declaration source-file]
   (.getLastToken ^js js-doc-namespace-declaration source-file)))

(defn for-each-child
  (^js [js-doc-namespace-declaration cb-node]
   (.forEachChild ^js js-doc-namespace-declaration cb-node))
  (^js [js-doc-namespace-declaration cb-node cb-node-array]
   (.forEachChild ^js js-doc-namespace-declaration cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-namespace-declaration]
  (.-decorators ^js js-doc-namespace-declaration))

(defn pos
  ^js [js-doc-namespace-declaration]
  (.-pos ^js js-doc-namespace-declaration))

(defn end
  ^js [js-doc-namespace-declaration]
  (.-end ^js js-doc-namespace-declaration))
