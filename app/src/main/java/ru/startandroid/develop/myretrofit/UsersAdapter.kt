package ru.startandroid.develop.myretrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.startandroid.develop.myretrofit.databinding.ActivityUserBinding

class UserAdapter(var users: List<User>) : RecyclerView.Adapter<UserAdapter.Holder>() {


        class Holder(var binding: ActivityUserBinding) : RecyclerView.ViewHolder(binding.root) {

            fun bind(user: User) {
                binding.userId.text = user.name
                binding.title.text = user.username
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            return Holder(ActivityUserBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }

        override fun onBindViewHolder(holder: Holder, position: Int) {
            holder.bind(users[position])
        }

        override fun getItemCount(): Int {
            return users.size
        }

    }
