(ns dots.typescript.missing-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [missing-declaration]
  (.-kind ^js missing-declaration))

(defn name
  ^js [missing-declaration]
  (.-name ^js missing-declaration))

(defn flags
  ^js [missing-declaration]
  (.-flags ^js missing-declaration))

(defn parent
  ^js [missing-declaration]
  (.-parent ^js missing-declaration))

(defn source-file
  ^js [missing-declaration]
  (.getSourceFile ^js missing-declaration))

(defn child-count
  (^js [missing-declaration]
   (.getChildCount ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getChildCount ^js missing-declaration source-file)))

(defn child-at
  (^js [missing-declaration index]
   (.getChildAt ^js missing-declaration index))
  (^js [missing-declaration index source-file]
   (.getChildAt ^js missing-declaration index source-file)))

(defn children
  (^js [missing-declaration]
   (.getChildren ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getChildren ^js missing-declaration source-file)))

(defn start
  (^js [missing-declaration]
   (.getStart ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getStart ^js missing-declaration source-file))
  (^js [missing-declaration source-file include-js-doc-comment?]
   (.getStart ^js missing-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [missing-declaration]
  (.getFullStart ^js missing-declaration))

(defn get-end
  ^js [missing-declaration]
  (.getEnd ^js missing-declaration))

(defn width
  (^js [missing-declaration]
   (.getWidth ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getWidth ^js missing-declaration source-file)))

(defn full-width
  ^js [missing-declaration]
  (.getFullWidth ^js missing-declaration))

(defn leading-trivia-width
  (^js [missing-declaration]
   (.getLeadingTriviaWidth ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getLeadingTriviaWidth ^js missing-declaration source-file)))

(defn full-text
  (^js [missing-declaration]
   (.getFullText ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getFullText ^js missing-declaration source-file)))

(defn text
  (^js [missing-declaration]
   (.getText ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getText ^js missing-declaration source-file)))

(defn first-token
  (^js [missing-declaration]
   (.getFirstToken ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getFirstToken ^js missing-declaration source-file)))

(defn last-token
  (^js [missing-declaration]
   (.getLastToken ^js missing-declaration))
  (^js [missing-declaration source-file]
   (.getLastToken ^js missing-declaration source-file)))

(defn for-each-child
  (^js [missing-declaration cb-node]
   (.forEachChild ^js missing-declaration cb-node))
  (^js [missing-declaration cb-node cb-node-array]
   (.forEachChild ^js missing-declaration cb-node cb-node-array)))

(defn decorators
  ^js [missing-declaration]
  (.-decorators ^js missing-declaration))

(defn modifiers
  ^js [missing-declaration]
  (.-modifiers ^js missing-declaration))

(defn pos
  ^js [missing-declaration]
  (.-pos ^js missing-declaration))

(defn end
  ^js [missing-declaration]
  (.-end ^js missing-declaration))
