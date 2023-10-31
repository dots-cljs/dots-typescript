(ns dots.typescript.print-handlers)

(defn has-global-name?
  "A hook used by the Printer when generating unique names to avoid collisions with
   globally defined names that exist outside of the current source file."
  ^js [print-handlers name]
  (.hasGlobalName ^js print-handlers name))

(defn on-emit-node
  "A hook used by the Printer to provide notifications prior to emitting a node. A
   compatible implementation **must** invoke `emitCallback` with the provided `hint` and
   `node` values."
  ^js [print-handlers hint node emit-callback]
  (.onEmitNode ^js print-handlers hint node emit-callback))

(defn emit-notification-enabled?
  "A hook used to check if an emit notification is required for a node."
  ^js [print-handlers node]
  (.isEmitNotificationEnabled ^js print-handlers node))

(defn substitute-node
  "A hook used by the Printer to perform just-in-time substitution of a node. This is
   primarily used by node transformations that need to substitute one node for another,
   such as replacing `myExportedVar` with `exports.myExportedVar`."
  ^js [print-handlers hint node]
  (.substituteNode ^js print-handlers hint node))
